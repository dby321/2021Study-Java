package com.binyu.chapter05.exercise21;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter05.exercise21
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-27 15:17
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Money manyMoney = Money.MANY_MONEY;
        System.out.println ( manyMoney );
        System.out.println ( "-------" );
        for (Money money : Money.values ()) {
            System.out.println ("[money type:"+money+",ordinal:"+money.ordinal ()+"]");
        }
    }
}
