package com.addaboy;

public class Yacht {
    private final DieRoller dieRoller;

    public Yacht(DieRoller dieRoller) {
        this.dieRoller = dieRoller;
    }

    public String rollDice() {
        String result = "";
        for (int i = 0; i < 5; i ++) {
            result += String.valueOf(dieRoller.roll());
        }

        return result;
    }
}