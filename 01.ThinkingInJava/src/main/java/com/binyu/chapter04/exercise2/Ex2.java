package com.binyu.chapter04.exercise2;

import java.util.ArrayList;
import java.util.Random;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter04.exercise2
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-26 11:41
 * @Description:
 */
public class Ex2 {
    private static ArrayList<Integer> generateRandomInt(int mount) {
        Random rand = new Random ();
        ArrayList<Integer> arrayList = new ArrayList<> ();
        for (int i = 0; i < mount; i++) {
            arrayList.add ( rand.nextInt () );
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = generateRandomInt ( 25 );
        System.out.println ( arrayList );
        ArrayList<String> stringArrayList = compareList ( arrayList );
        System.out.println ( stringArrayList );
    }

    private static ArrayList<String> compareList(ArrayList<Integer> arrayList) {
        ArrayList<String> stringArrayList = new ArrayList<> ();
        for (int i = 0; i < arrayList.size () - 1; i++) {
            // compare
            if (arrayList.get ( i ) > arrayList.get ( i + 1 )) {
                stringArrayList.add ( arrayList.get ( i ) + ">" + arrayList.get ( i + 1 ) );
            } else if (arrayList.get ( i ) < arrayList.get ( i + 1 )) {
                stringArrayList.add ( arrayList.get ( i ) + "<" + arrayList.get ( i + 1 ) );
            } else {
                stringArrayList.add ( arrayList.get ( i ) + "=" + arrayList.get ( i + 1 ) );
            }
        }
        return stringArrayList;
    }
}
