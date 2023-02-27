package com.compare;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.compare
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-23 19:30
 * @Description:
 */
public class Goods  implements Comparable{
    private String name;
    private Double money;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return this.money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Goods(String name, Double money) {
        this.name = name;
        this.money = money;
    }

    public Goods() {
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Goods){
            Goods goods=(Goods)o;
            // 方式一
            if(this.money>goods.money){
                return 1;
            }else if(this.money<goods.money){
                return -1;
            }else{
                return 0;
            }
            // 方式二
//            return Double.compare ( this.money,goods.money );
        }
        throw new RuntimeException ( "传入的数据类型不一致" );
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
