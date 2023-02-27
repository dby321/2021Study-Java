package day10.exer4;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day10.exer4
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-15 11:01
 * @Description:
 */
public class Bank {
    private Customer[] customers;//存放多个客户的数组
    private int numberOfCustomer;//记录客户的个数
    public Bank(){
        customers=new Customer[10];
    }
    public void addCustomer(String f,String l){
        Customer customer=new Customer ( f,l );
        customers[numberOfCustomer]=customer;
        numberOfCustomer++;
    }
    public int getNumberOfCustomer(){
        return this.numberOfCustomer;
    }

    public Customer getCustomer(int index) {
//        return customers[index];//可能报异常
        if(index>=0&&index<numberOfCustomer){
            return customers[index];
        }else{
             return null;
        }
    }
}
