package day10.exer4;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day10.exer4
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-15 11:12
 * @Description:
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank=new Bank ();
        bank.addCustomer ( "Jane","Smith" );
        bank.getCustomer ( 0 ).setAccount ( new Account ( 2000 ) );
        bank.getCustomer ( 0 ).getAccount ().withdraw ( 500 );
        double balance = bank.getCustomer ( 0 ).getAccount ().getBalance ();
        System.out.println ("客户"+bank.getCustomer ( 0 ).getFirstName ()+"的账户余额为："+balance);
        System.out.println ("***************");
        bank.addCustomer ( "马" ,"冬梅");
        int numberOfCustomer = bank.getNumberOfCustomer ();
        System.out.println ("银行的客户数为"+numberOfCustomer);

    }
}
