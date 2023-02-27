package day10.exer4;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day10.exer4
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-15 10:59
 * @Description:
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f,String l){
        this.firstName=f;
        this.lastName=l;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Account getAccount() {
        return this.account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
