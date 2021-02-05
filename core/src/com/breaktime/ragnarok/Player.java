package com.breaktime.ragnarok;

public class Player {
    private String name;
    private int id;

    public final static int WRONG_NAME_ERROR = 1;

    public int setName(String name) {
        if (name.length()>0)
            this.name = name;
        else
            return WRONG_NAME_ERROR;
        return 0;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
