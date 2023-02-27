package com.binyu.chapter05.exercise22;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter05.exercise22
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-27 15:25
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Money[] moneys = new Money[]{
          Money.MANY_MONEY,Money.SOME_MONEY,Money.MANY_MONEY,Money.NO_MONEY
        };
        for(Money money:moneys){
            switch (money) {
                case NO_MONEY:
                    System.out.println ( "you have no money" );
                    break;
                case SOME_MONEY:
                    System.out.println ( "you have some money" );
                    break;
                case MANY_MONEY:
                    System.out.println ( "you have many money" );
                    break;
                default:
                    System.out.println ( "other" );
                    break;
            }
        }
    }
}
