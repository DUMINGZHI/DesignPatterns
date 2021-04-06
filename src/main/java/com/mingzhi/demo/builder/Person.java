package com.mingzhi.demo.builder;

public class Person {
    private String name;
    private String sex;
    private int age;
    private int money;

    public static class PersonBuilder{
        Person person = new Person();

        public PersonBuilder nameSexBuild(String name, String sex){
            person.name = name;
            person.sex = sex;
            return this;
        }

        public PersonBuilder ageMoneyBuild(int age, int money){
            person.age = age;
            person.money = money;
            return this;
        }

        public Person build(){
            return person;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }
}
