package day11.project2.ui;

import day11.project2.bean.Customer;
import day11.project2.service.CustomerList;
import day11.project2.util.CMUtility;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day11.project2.ui
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-16 10:03
 * @Description:
 */
public class CustomerView {
    private CustomerList customerList = new CustomerList ( 10 );

    public CustomerView() {
        Customer customer = new Customer ( "王涛", '男', 23, "1323213213", "wt@gmail.com" );
        customerList.addCustomer ( customer );
    }

    /**
     * 显示客户信息管理关键的方法
     */
    public void enterMainMenu() {
        boolean isFlag = true;
        while (isFlag) {
            System.out.println ( "\n---客户信息管理软件---" );
            System.out.println ( "     1.添加客户          " );
            System.out.println ( "     2.修改客户          " );
            System.out.println ( "     3.删除客户          " );
            System.out.println ( "     4.客户列表          " );
            System.out.println ( "     5.退出\n" );
            System.out.print ( "请选择(1-5):" );
            char menu = CMUtility.readMenuSelection ();
            switch (menu) {
                case '1':
                    addNewCustomer ();
                    break;
                case '2':
                    modifyCustomer ();
                    break;
                case '3':
                    deleteCustomer ();
                    break;
                case '4':
                    listAllCustomers ();
                    break;
                case '5':
                    System.out.print ( "确认是否退出(Y/N)" );
                    char isExit = CMUtility.readConfirmSelection ();
                    if (isExit == 'Y') {
                        isFlag = false;
                    } else {
                        continue;
                    }
                    break;
            }
//            isFlag=false;
        }
    }

    private void addNewCustomer() {
//        System.out.println ( "添加客户的操作" );
        System.out.println ( "---------添加客户--------" );
        System.out.print ( "姓名:" );
        String name = CMUtility.readString ( 10 );
        System.out.print ( "性别:" );
        char gender = CMUtility.readChar ();
        System.out.print ( "年龄:" );
        int age = CMUtility.readInt ();
        System.out.print ( "电话:" );
        String phone = CMUtility.readString ( 13 );
        System.out.print ( "邮箱:" );
        String email = CMUtility.readString ( 30 );
        Customer customer = new Customer ( name, gender, age, phone, email );
        boolean isSuccess = customerList.addCustomer ( customer );
        if (isSuccess) {
            System.out.println ( "----------添加成功--------" );
        } else {
            System.out.println ( "----------客户目录已满，添加失败---------" );
        }

    }

    private void modifyCustomer() {
//        System.out.println ( "修改客户的操作" );
        System.out.println ( "--------修改客户--------" );
        Customer customer;
        int number;
        for (; ; ) {
            System.out.print ( "请选择修改的客户编号(-1退出)" );
            number = CMUtility.readInt ();
            if (number == -1) {
                return;
            }
            customer = customerList.getCustomer ( number - 1 );
            if (customer == null) {
                System.out.println ( "无法找到指定客户" );
                continue;
            } else {// 找到相应编号的客户
                break;
            }
        }
        // 修改客户信息
        System.out.print ( "姓名(" + customer.getName () + "):" );
        String name = CMUtility.readString ( 10, customer.getName () );
        System.out.print ( "性别(" + customer.getGender () + "):" );
        char gender = CMUtility.readChar ( customer.getGender () );
        System.out.print ( "年龄(" + customer.getAge () + "):" );
        int age = CMUtility.readInt ( customer.getAge () );
        System.out.print ( "电话(" + customer.getPhone () + "):" );
        String phone = CMUtility.readString ( 13, customer.getPhone () );
        System.out.print ( "邮箱(" + customer.getEmail () + "):" );
        String email = CMUtility.readString ( 30, customer.getEmail () );
        boolean isReplaced = customerList.replaceCustomer ( number - 1, new Customer ( name, gender, age, phone, email ) );
        if (isReplaced) {
            System.out.println ( "--------修改完成--------" );
        } else {
            System.out.println ( "--------修改失败--------" );
        }
    }

    private void deleteCustomer() {
//        System.out.println ( "删除客户的操作" );
        System.out.println ( "-------删除客户-------" );
        int number;
        for (; ; ) {
            System.out.print ( "请选择待删除客户编号(-1退出):" );
            number = CMUtility.readInt ();
            if (number == -1) {
                return;
            }
            Customer customer = customerList.getCustomer ( number - 1 );
            if (customer == null) {
                System.out.println ( "无法找到指定客户！" );
            } else {
                break;
            }
        }
        System.out.print ( "确认是否删除(Y/N):" );
        char isDelete = CMUtility.readConfirmSelection ();
        if (isDelete == 'Y') {
            boolean deleteSuccess = customerList.deleteCustomer ( number - 1 );
            if (deleteSuccess) {
                System.out.println ( "-------删除完成------" );
            } else {
                System.out.println ( "-------删除失败------" );
            }
        } else {
            return;
        }
    }

    private void listAllCustomers() {
//        System.out.println ("客户列表的操作");
        System.out.println ( "----------------------客户列表-----------------------" );
        if (customerList.getTotal () == 0) {
            System.out.println ( "没有客户数据" );
        } else {
            System.out.println ( "编号\t姓名\t性别\t年龄\t电话\t\t邮箱" );
            Customer[] customers = customerList.getAllCustomers ();
            for (int i = 0; i < customers.length; i++) {
                System.out.println ( (i + 1) + "\t\t" + customers[i].getName () + "\t" + customers[i].getGender () + "\t\t" + customers[i].getAge () + "\t\t" + customers[i].getPhone () + "\t" + customers[i].getEmail () );
            }
        }
        System.out.println ( "---------------------客户列表完成----------------------" );
    }

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView ();
        customerView.enterMainMenu ();
    }
}
