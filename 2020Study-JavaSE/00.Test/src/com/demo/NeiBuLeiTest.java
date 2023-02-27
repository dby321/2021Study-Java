package com.demo;

import org.junit.Test;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.demo
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-31 13:44
 * @Description:
 */
public class NeiBuLeiTest {
    @Test
    public void test1(){
        Person person=new Person ();
        person.setAge ( 23 );
        person.setName ("董滨雨");
        System.out.println (person);
    }
    public class Person{
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

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
