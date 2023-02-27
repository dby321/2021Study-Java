package day10.exer3;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day10.exer3
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-14 18:20
 * @Description:
 */
public class Account {
    //账号
    private int id;

    //余额
    private double balance;

    //年利率
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public void withdraw(double amount){
        if(balance<amount){
            System.out.println ("余额不足，取款失败");
            return;
        }
        balance-=amount;
        System.out.println ("成功取出"+amount);
    }
    public void deposit(double amount){
        if(amount<0){
            throw new RuntimeException ( "存钱数需大于零" );
        }else{
            balance+=amount;
            System.out.println ("成功存入"+amount);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                '}';
    }
}
