package com.company;

public class Admin extends Person{

    private String leader;
    private String parking;

    public Admin(String name, String identification, int age, String leader, String parking) {
        super(name, identification, age);
        this.leader = leader;
        this.parking = parking;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    @Override
    public String toString() {
        return "Name: " + name + '\'' + ", Identification: " + identification + '\'' + ", Age: " + age + '\''
                + "Leader: "+ leader + '\'' + "Parking: " + parking;
    }
}
