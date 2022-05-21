package com.company;

public class Watchman extends Person{

    private String weapon;
    private String workday;

    public Watchman(String name, String identification, int age, String weapon, String workday) {
        super(name, identification, age);
        this.weapon = weapon;
        this.workday = workday;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWorkday() {
        return workday;
    }

    public void setWorkday(String workday) {
        this.workday = workday;
    }

    @Override
    public String toString() {
        return "Name: " + name + '\'' + ", Identification: " + identification + '\'' + ", Age: " + age + "Weapon: "
                + weapon + '\'' + "Workday: "+ workday;
    }
}
