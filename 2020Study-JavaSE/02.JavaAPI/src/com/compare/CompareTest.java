package com.compare;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.compare.demo2
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-23 19:39
 * @Description:
 */
public class CompareTest {
    @Test
    public void test1(){
        String[] arr=new String[]{"AA","CC","KK","MM","GG","JJ","DD"};
        // 按字母序从高到低
        Arrays.sort ( arr, new Comparator<String> () {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo ( o2 );
            }
        } );
        System.out.println (Arrays.toString ( arr ));//[MM, KK, JJ, GG, DD, CC, AA]
    }

    @Test
    public void test2(){
        Goods[] arr=new Goods[6];
        arr[0]=new Goods ("lenovo",30d);
        arr[1]=new Goods ("huawei",40d);
        arr[2]=new Goods ("xiaomi",35d);
        arr[3]=new Goods ("dell",20d);
        arr[4]=new Goods ("dell",40d);
        arr[5]=new Goods ("dell",30d);
        Arrays.sort ( arr, new Comparator<Goods> () {
//            指明商品比较大小的方式：按照产品名称从低到高排序，再按照价格从高到低排序
            @Override
            public int compare(Goods o1, Goods o2) {
                if(o1.getName ().equals ( o2.getName () )){
                    return -Double.compare ( o1.getMoney (),o2.getMoney () );
                }else{
                    return o1.getName ().compareTo ( o2.getName () );
                }
            }
        } );
        System.out.println (Arrays.toString ( arr ));
    }
}
