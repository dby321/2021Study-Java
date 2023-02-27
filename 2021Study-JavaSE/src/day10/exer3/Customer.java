package day10.exer3;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day10.exer3
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-15 10:41
 * @Description:
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

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

    public Customer(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

}
