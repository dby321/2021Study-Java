package day10.exer4;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day10.exer4
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-15 10:56
 * @Description:
 */
public class Account {
    private double balance;
    public Account(double init_balance){
        this.balance=init_balance;
    }

    public double getBalance() {
        return this.balance;
    }
    public void deposit(double amt){
        if(amt>0){
            balance+=amt;
            System.out.println ("存钱成功");
        }
    }
    public void withdraw(double amt){
        if(balance>=amt){
            balance-=amt;
            System.out.println ("取钱成功");
        }else{
            System.out.println ("余额不足");
        }
    }
}
