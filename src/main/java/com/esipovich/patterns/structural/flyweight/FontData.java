package com.esipovich.patterns.structural.flyweight;

/*  Flyweight(Приспособленец)
 *  если у разных объектов совпадает часть состояния,
 *  Flyweight позволяет им разделять между собой это состояние,
 *  не храня его в каждом объекте. Это экономит память и позволяет
 *  программе иметь огромное количество похожих объектов
 */

import java.awt.*;
import java.lang.ref.WeakReference;
import java.util.*;

public final class FontData {
    private static final WeakHashMap<FontData, WeakReference<FontData>> flyweightData =
            new WeakHashMap<FontData, WeakReference<FontData>>();
    private final int pointSize;
    private final String fontFace;
    private final Color color;
    private final Set<FontEffect> effects;

    private FontData(int pointSize, String fontFace, Color color, EnumSet<FontEffect> effects) {
        this.pointSize = pointSize;
        this.fontFace = fontFace;
        this.color = color;
        this.effects = Collections.unmodifiableSet(effects);
    }

    public static FontData create(int pointSize, String fontFace, Color color,
                                  FontEffect... effects) {
        EnumSet<FontEffect> effectsSet = EnumSet.noneOf(FontEffect.class);
        effectsSet.addAll(Arrays.asList(effects));
        FontData data = new FontData(pointSize, fontFace, color, effectsSet);
        if (!flyweightData.containsKey(data)) {
            flyweightData.put(data, new WeakReference<FontData>(data));
        }
        return flyweightData.get(data).get();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FontData) {
            if (obj == this) {
                return true;
            }
            FontData other = (FontData) obj;
            return other.pointSize == pointSize && other.fontFace.equals(fontFace)
                    && other.color.equals(color) && other.effects.equals(effects);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (pointSize * 37 + effects.hashCode() * 13) * fontFace.hashCode();
    }
}


/*  Плюсы
 *  экономит оперативную память
 */

/*  Минусы
 *  расходует процессорное время на поиск и вычисление контекста
 *  усложняет код программы за счёт множества дополнительных классов
 */