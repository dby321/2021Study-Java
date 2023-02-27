package com.binyu.chapter04.exercise10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter04.exercise10
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-26 14:26
 * @Description:
 */
public class Ex10 {
    public static void main(String[] args) {
        int sum1;
        Set<Integer> set=new HashSet<> (  );
        System.out.println ("------运算式子------");
        for(int i=10;i<100;i++){
            for(int j=10;j<100;j++){
                ArrayList<Integer> arrayList=new ArrayList<> (  );
                arrayList.add ( i/10 );
                arrayList.add ( i%10 );
                arrayList.add ( j/10 );
                arrayList.add ( j%10 );
                sum1=i*j;
                if(sum1<1000){
                    continue;
                }
                if(arrayList.contains ( (sum1/1000)%10 )){
                    arrayList.remove ( new Integer ((sum1/1000)%10 ) );
                }else {
                    continue;
                }
                if(arrayList.contains ( (sum1/100)%10 )){
                    arrayList.remove ( new Integer((sum1/100) %10));
                }else {
                    continue;
                }
                if(arrayList.contains ( (sum1/10)%10 )){
                    arrayList.remove (  new Integer((sum1/10)%10 ) );
                }else{
                    continue;
                }
                if(arrayList.contains ( (sum1/1)%10 )){
//                    此时说明找到了吸血鬼数,但还未去重
                    System.out.println ("i:"+i+" j:"+j+"吸血鬼数:"+sum1);
                    set.add ( sum1 );
                }
            }
        }
        System.out.println ("------去重后的吸血鬼数------");
        Iterator<Integer> iterator = set.iterator ();
        while(iterator.hasNext ()){
            System.out.print (iterator.next ()+" ");
        }
    }
}
