package com.breaktime.ragnarok.battle.mechanics;

public enum Maps {
    England;

    public int size(){
        switch (this){
            case England:return 512;
            default:return -1;
        }
    }
}
