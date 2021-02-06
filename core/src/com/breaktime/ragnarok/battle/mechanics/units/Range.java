package com.breaktime.ragnarok.battle.mechanics.units;

public class Range extends Unit{
    public Range(int x, int y) {
        this.x = x;
        this.y = y;
        damage = 5;
        speed = 2;
        range = 4;
        hp = 50;
        cWood = 100;
        cStone = 50;
        food = 2;
    }
}
