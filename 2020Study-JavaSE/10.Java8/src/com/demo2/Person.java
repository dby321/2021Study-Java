package com.demo2;

import java.util.Objects;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.collection.demo1
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-25 19:59
 * @Description:
 */
public class Person implements Comparable{
    private String name;
    private Integer age;

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

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Person){
            Person person= (Person) o;
            return this.name.compareTo ( person.name );
        }else{
            throw new RuntimeException ( "输入的类型不匹配" );
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Person person = (Person) o;
        return Objects.equals ( name, person.name ) &&
                Objects.equals ( age, person.age );
    }

    @Override
    public int hashCode() {
        return Objects.hash ( name, age );
    }
}
