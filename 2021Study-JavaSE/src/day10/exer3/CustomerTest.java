package day10.exer3;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day10.exer3
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-15 10:44
 * @Description:
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer=new Customer ( "Jane","Smith" );
        Account account= new Account ( 1000, 2000,1.23);
        customer.setAccount (account);
        // 存入100
        customer.getAccount ().deposit ( 100 );
        System.out.println ( customer.getAccount () );
        // 取出960
        customer.getAccount ().withdraw ( 960 );
        System.out.println (customer.getAccount ());
        // 取出2000
        customer.getAccount ().withdraw ( 2000 );
        System.out.println (customer.getAccount ());

    }
}
