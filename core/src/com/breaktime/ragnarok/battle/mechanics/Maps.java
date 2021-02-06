package com.breaktime.ragnarok.battle.mechanics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Maps {
    England;

    private static final List<Maps> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public int size(){
        switch (this){
            case England:return 512;
            default:return -1;
        }
    }

    public static Maps getRandomMap(){
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
