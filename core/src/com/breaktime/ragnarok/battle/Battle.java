package com.breaktime.ragnarok.battle;

import com.breaktime.ragnarok.Player;
import com.breaktime.ragnarok.battle.mechanics.Maps;

import java.util.ArrayList;

public class Battle {
    Player[] players;
    MapBack map;

    public Battle(Player[] players) {
        this.players = players;
        for (Player x:players){
            x.units = new ArrayList<>();
            x.buildings = new ArrayList<>();
        }
        map = new MapBack(Maps.getRandomMap(), this);
    }
}
