package com.breaktime.ragnarok.DB;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.breaktime.ragnarok.battle.mechanics.Maps;

import java.util.Scanner;

public class Database {
    public static int[][] loadMap(Maps map){
        FileHandle handle = Gdx.files.internal("England.map");
        Scanner scan = new Scanner(handle.reader());

        int n = map.size();
        int[][] result = new int[n][n];
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++)
                result[i][j] = scan.nextInt();
        return result;
    }
}
