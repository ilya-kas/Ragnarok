package com.breaktime.ragnarok.battle.mechanics.units;

public class Melee extends Unit{
    public Melee(int x, int y) {
        this.x = x;
        this.y = y;
        damage = 5;
        speed = 3;
        range = 1;
        hp = 100;
        cWood = 100;
        cStone = 0;
        food = 2;
    }
}
