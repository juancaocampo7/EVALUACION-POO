package com.company;

public class Person {
    protected String name;
    protected String identification;
    protected int age;

    public Person(String name, String identification, int age) {
        this.name = name;
        this.identification = identification;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + '\'' + ", Identification: " + identification + '\'' + ", age: " + age;
    }
}
