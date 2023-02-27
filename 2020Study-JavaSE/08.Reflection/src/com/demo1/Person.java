package com.demo1;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.demo1
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-28 19:37
 * @Description:
 */
public class Person {
    private String name;
    public Integer age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    private Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void show(){
        System.out.println ("我是show");
    }
    private void showNation(String nation){
        System.out.println ("我是showNation:"+nation);
    }

    private static String staticShow(){
        System.out.println ("我是staticShow()");
        return "staticShow()的返回";
    }
}
