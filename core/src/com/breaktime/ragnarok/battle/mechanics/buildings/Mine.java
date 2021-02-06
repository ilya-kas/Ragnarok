package com.breaktime.ragnarok.battle.mechanics.buildings;

//добывает железо или золото, смотря на чём стоит
public class Mine extends Building {
    int type;
    /**
     * 4-камень
     * 5-золото
     */

    public Mine(int x, int y, int type) {
        this.x = x;
        this.y = y;
        width = 3;
        height = 3;
        hp = 200;
        cWood = 75;
        cStone = 0;
        this.type = type;
    }
}
