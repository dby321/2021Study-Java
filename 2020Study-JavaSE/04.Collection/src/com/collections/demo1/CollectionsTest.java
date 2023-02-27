package com.collections.demo1;

import org.junit.Test;

import java.util.*;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.collections.demo1
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-26 11:38
 * @Description:
 */
public class CollectionsTest {
    /**
     * Collections工具类
     */
    @Test
    public void test1(){
        List<Integer> arrayList=new ArrayList<> (  );
        arrayList.add ( 123 );
        arrayList.add ( 456 );
        arrayList.add ( 456 );
        arrayList.add ( 345 );
        arrayList.add ( 678 );
        System.out.println (arrayList);
        Collections.reverse ( arrayList );
        System.out.println ("reverse"+arrayList);
        Collections.shuffle ( arrayList );
        System.out.println ("shuffle"+arrayList);
        Collections.sort ( arrayList );
        System.out.println ("sort"+arrayList);
        Collections.swap ( arrayList,1,2 );
        System.out.println ("swap"+arrayList);

        System.out.println ("----");
        int frequency = Collections.frequency ( arrayList, 456 );
        System.out.println ("frequency "+frequency);
        List dest= Arrays.asList ( new Object[arrayList.size ()] );
        System.out.println (dest.size ());
        System.out.println (dest);
        Collections.copy ( dest,arrayList );
        System.out.println (dest);

        System.out.println ("----");
        List<Integer> synchronizedList = Collections.synchronizedList ( arrayList );
        Map map=new HashMap ( 16 );
        Map synchronizedMap= Collections.synchronizedMap ( map );

    }
}
