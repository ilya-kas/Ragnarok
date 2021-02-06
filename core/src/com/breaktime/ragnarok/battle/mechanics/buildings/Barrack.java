package com.breaktime.ragnarok.battle.mechanics.buildings;

public class Barrack extends Building{
    public Barrack(int x, int y) {
        this.x = x;
        this.y = y;
        width = 3;
        height = 3;
        cWood = 150;
        cStone = 0;
        hp = 500;
    }
}
