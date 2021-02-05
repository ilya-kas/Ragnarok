package com.breaktime.ragnarok.battle;

import com.breaktime.ragnarok.DB.Database;
import com.breaktime.ragnarok.battle.mechanics.Maps;

public class MapBack {
    private int[][] buildings;  //в старших битах - номер игрока-хозяина, в младших - номер здания
    /**
     * 0-равнина
     * 1-вода
     * 2-лес
     * 3-холм
     */
    private int[][] map;

    public MapBack(Maps map) {
        buildings = new int[map.size()][map.size()];
        this.map = Database.loadMap(map);
    }

    public int getPlayer(int x, int y){
        return buildings[x][y]>>3*8;
    }

    public int getBuilding(int x, int y){
        return (int) (buildings[x][y]%Math.round(Math.pow(2,3*8)));
    }

    public int getType(int x, int y){
        return map[x][y];
    }
}
