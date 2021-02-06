package com.breaktime.ragnarok.battle.mechanics.units;

public class Worker extends Unit{
    public Worker(int x, int y) {
        this.x = x;
        this.y = y;
        damage = 2;
        speed = 2.5f;
        range = 1;
        hp = 50;
        cWood = 75;
        cStone = 0;
        food = 2;
    }
}
