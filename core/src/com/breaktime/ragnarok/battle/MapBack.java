package com.breaktime.ragnarok.battle;

import com.breaktime.ragnarok.DB.Database;
import com.breaktime.ragnarok.Player;
import com.breaktime.ragnarok.battle.mechanics.Maps;
import com.breaktime.ragnarok.battle.mechanics.buildings.Building;
import com.breaktime.ragnarok.battle.mechanics.buildings.Mine;
import com.breaktime.ragnarok.battle.mechanics.units.Unit;

public class MapBack {
    private int[][] buildings;  //в старших битах - номер игрока-хозяина, в младших - номер здания
    /**
     * 0-вода
     * 1-равнина
     * 2-холм
     * 3-лес
     * 4-камень
     * 5-золото
     */
    private int[][] map;
    Battle battle; //ссылка на нынешний бой

    public MapBack(Maps map, Battle battle) {
        buildings = new int[map.size()][map.size()];
        this.map = Database.loadMap(map);
        this.battle = battle;
    }

    public int getPlayer(int x, int y) {
        return buildings[x][y] >> 3 * 8;
    }

    public int getBuilding(int x, int y) {
        return (int) (buildings[x][y] % Math.round(Math.pow(2, 3 * 8)));
    }

    public int getType(int x, int y) {
        return map[x][y];
    }

    public boolean canBuild(Building building) {
        int l = (int) building.x, t = (int) building.y;
        for (int i = l; i <= building.x + building.width; i++)       //не заняты ли клетки другими строениями
            for (int j = t; j <= building.y + building.height; j++)
                if (buildings[i][j] != 0)
                    return false;
        int type = map[l][t];
        for (int i = l; i <= building.x + building.width; i++)       //рельеф
            for (int j = t; j <= building.y + building.height; j++)
                if (map[i][j] != type)
                    return false;
        if (type != 0 && type != 3)
            if (!(building instanceof Mine && (type==4 || type==5)))
            return false;
        for (Player player : battle.players)                         //юниты
            for (Unit mob:player.units)
                if (mob.x>=l && mob.x<=building.x + building.width &&
                        mob.y>=l && mob.y<=building.y + building.height)
                    return false;
        return true;
    }

    /**
     * При условии, что до этого проверили можно ли строить!!!!
     * @param building стоимое здание
     */
    public void build(Building building, int owner, int number) {
        int l = (int) building.x, t = (int) building.y;
        for (int i = l; i < building.x + building.width; i++)       //не заняты ли клетки другими строениями
            for (int j = t; j < building.y + building.height; j++)
                buildings[i][j] = owner << 3*8 + number;
    }
}
