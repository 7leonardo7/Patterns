package com.esipovich.patterns.behavioral.templatemethod;

public class Monopoly extends Game{
    @Override
    protected void initializeGame() {
        // monopoly specific initialization actions
    }

    @Override
    protected void playGame() {
        // monopoly specific play actions
    }

    @Override
    protected void endGame() {
        // monopoly specific actions to end a game
    }

    @Override
    protected void printWinner() {
        // monopoly specific actions to print winner
    }
}
