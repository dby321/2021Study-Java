package day11.project2.service;

import day11.project2.bean.Customer;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day11.project2.service
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-16 09:59
 * @Description:
 */
public class CustomerList {
    private Customer[] customers;
    private int total = 0;

    /**
     * 用来初始化customers数组的构造器
     *
     * @param totalCustomer 指定数组的长度
     */
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) {
            System.out.println ( "添加失败" );
            return false;
        } else {
            customers[total] = customer;
            total++;
            return true;
        }
    }

    public boolean replaceCustomer(int index, Customer cust) {
        if (index >= total || index < 0) {
            return false;
        } else {
            customers[index] = cust;
            return true;
        }
    }

    /**
     * 删除指定索引位置上的客户
     * @param index 删除的索引
     * @return true为删除成功
     */
    public boolean deleteCustomer(int index) {
        if (index >= total || index < 0) {
            return false;
        } else {
            for (int i = index; i < total - 1; i++) {
                customers[i] = customers[i + 1];
            }
            customers[total - 1] = null;
            total--;
            return true;
        }
    }

    public Customer[] getAllCustomers() {
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }
    public Customer getCustomer(int index){
        if(index<0||index>=total){
            return null;
        }else{
            return customers[index];
        }
    }
    public int getTotal(){
        return this.total;
    }

}
