package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Watchman> watchman = new ArrayList<Watchman>();
    static ArrayList<CleaningStaff> cleaningStaff = new ArrayList<CleaningStaff>();
    static ArrayList<Accountant> accountant = new ArrayList<Accountant>();
    static ArrayList<Admin> admin = new ArrayList<Admin>();

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        //DIGITAR BASE DE DATOS//
            llenarBaseDatos();

            //MOSTRAR RESULTADOS//
                showResults();
    }
    public static void llenarBaseDatos(){
        String respuesta;
        int opcion;
        do {
            do {
                System.out.println("Digite que perfil desea completar: ");
                System.out.println("1. Watchman");
                System.out.println("2. CleaningStaff");
                System.out.println("3. Accountant");
                System.out.println("4. Admin");
                System.out.println("5. Show Results");
                opcion = entrada.nextInt();
            }while(opcion <1 || opcion>5);

            switch (opcion){
                case 1: dataBaseWatchman();
                    break;
                case 2: dataBaseCleaningStaff();
                    break;
                case 3: dataBaseAccountant();
                    break;
                case 4: dataBaseAdmin();
                    break;
                case 5: showResults();
                    break;
            }
            System.out.println("\n Desea seguir (S/N): ");
            respuesta = entrada.nextLine();
            System.out.println("");

        }while (respuesta == "S" || respuesta == "s");
    }

        public static void dataBaseWatchman(){
            String name, identification, weapon, workday;
            int age;

            System.out.println("Name: ");
            name = entrada.nextLine();
            System.out.println("Identification: ");
            identification = entrada.nextLine();
            System.out.println("Age: ");
            age = entrada.nextInt();
            System.out.println("Weapon: ");
            weapon = entrada.nextLine();
            System.out.println("WorkDay: ");
            workday = entrada.nextLine();

            Watchman watchman1 = new Watchman(name, identification, age, weapon, workday);
            watchman.add(watchman1);
    }

        public static void dataBaseCleaningStaff(){
            String name, identification, dayOff;
            int age;

            System.out.println("Name: ");
            name = entrada.nextLine();
            System.out.println("Identification: ");
            identification = entrada.nextLine();
            System.out.println("Age: ");
            age = entrada.nextInt();
            System.out.println("DayOff: ");
            dayOff = entrada.nextLine();

            CleaningStaff cleaningStaff1 = new CleaningStaff(name, identification, age, dayOff);
            cleaningStaff.add(cleaningStaff1);
        }

        public static void dataBaseAccountant(){
            String name, identification, leader, parking;
            int age;

            System.out.println("Name: ");
            name = entrada.nextLine();
            System.out.println("Identification: ");
            identification = entrada.nextLine();
            System.out.println("Age: ");
            age = entrada.nextInt();
            System.out.println("Leader: ");
            leader = entrada.nextLine();
            System.out.println("Parking: ");
            parking = entrada.nextLine();

            Accountant accountant1 = new Accountant(name, identification, age, leader, parking);
            accountant.add(accountant1);
        }

        public static void dataBaseAdmin(){
            String name, identification, leader, parking;
            int age;

            System.out.println("Name: ");
            name = entrada.nextLine();
            System.out.println("Identification: ");
            identification = entrada.nextLine();
            System.out.println("Age: ");
            age = entrada.nextInt();
            System.out.println("Leader: ");
            leader = entrada.nextLine();
            System.out.println("Parking: ");
            parking = entrada.nextLine();

            Admin admin1 = new Admin(name, identification, age, leader, parking);
            admin.add(admin1);
        }

        public static void showResults(){
            for (Watchman watchman2: watchman) {
                System.out.println(watchman2.toString());
            }
            for (CleaningStaff cleaningStaff2: cleaningStaff) {
                System.out.println(cleaningStaff2.toString());
            }
            for (Accountant accountant2: accountant) {
                System.out.println(accountant2.toString());
            }
            for (Admin admin2: admin)  {
                System.out.println(admin2.toString());
            }
        }
}
