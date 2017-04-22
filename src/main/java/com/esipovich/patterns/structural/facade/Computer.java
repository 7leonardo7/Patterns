package com.esipovich.patterns.structural.facade;

public class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer() {
    }

    public Computer(CPU cpu, Memory memory, HardDrive hardDrive) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public void startComputer(){
        cpu.freeze();
        memory.load(1, hardDrive.read(1, 2));
        cpu.jump(1);
        cpu.execute();
    }
}
