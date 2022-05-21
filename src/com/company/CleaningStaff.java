package com.company;

public class CleaningStaff extends Person{

    private String dayOff;

    public CleaningStaff(String name, String identification, int age, String dayOff) {
        super(name, identification, age);
        this.dayOff = dayOff;
    }

    public String getDayOff() {
        return dayOff;
    }

    public void setDayOff(String dayOff) {
        this.dayOff = dayOff;
    }

    @Override
    public String toString() {
        return "Name: " + name + '\'' + ", Identification: " + identification + '\'' + ", Age: " + age + '\''
                + "DayOff: " + dayOff;
    }
}
