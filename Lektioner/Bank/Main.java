package com.company;

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Meny();
    }

    public static void Meny() {
        Bank bank = new Bank(5);
        Scanner sc;
        int choice;
        while (true) {
            sc = new Scanner(System.in);
            System.out.println("1. Add person\n2. Add money\n3. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case (1):
                    bank.addPerson();
                    break;
                case (2):
                    sc.nextLine();
                    System.out.println("Vad är ditt namn?");
                    String name = sc.nextLine();
                    System.out.println(name);
                    System.out.println("Vad är ditt lösenord?");
                    String password = sc.nextLine();
                    System.out.println(password);
                    System.out.println("Hur mycket vill du sätta in?");
                    double money = sc.nextDouble();
                    System.out.println(money);
                    sc.nextLine();

                    try{
                        bank.addMoney(name, password, money);
                    }catch (Exception e){
                        System.out.println("Fanns inte");
                    }
                    break;
                case (3):
                    System.exit(0);
                    break;
             }
        }
    }
}

class Person{
    private String name;
    private double money;
    private String password;

    Person(String name, double money, String password) {
        this.name = name;
        this.money = money;
        this.password = password;
    }

    Person(String name, String password) {
        this.name = name;
        this.money = 0;
        this.password = password;
    }

    public void changePassword(String newpassword) {
        this.password = newpassword;
    }

    public String viewPassword() {
        return this.password;
    }

    public String viewName() {
        return this.name;
    }

    public double viewMoney() {
        return this.money;
    }

    public void changeMoney(double money) {
        this.money = money;
    }
}

class Bank {
    int nrOfPeople;
    Person[] people;

    Bank() {
        nrOfPeople = 0;
        people = new Person[10];
    }

    Bank(int arraySize) {
        nrOfPeople = 0;
        people = new Person[arraySize];
    }

    public void addPerson() {
        String password;
        String second;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vad heter du?");
        String name = sc.nextLine();
        int l = 1;
        do {
            if (l != 1) {
                System.out.println("De var inte samma. Välj igen!");
            }
            System.out.println("Välj ett lösenord!");
            password = sc.nextLine();
            System.out.println("Bekräfta lösenord!");
            second = sc.nextLine();
            l++;
        } while (!password.equals(second));

        this.people[nrOfPeople] = new Person(name, password);
        System.out.println("Kontot har skapats");
        nrOfPeople++;
    }

    public void viewPeople() {
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].viewName());
        }
    }

    public void addMoney(String name, String password, double money) {
        for (Person p : people) {
            if (p.viewName().equals(name)) {
                if (p.viewPassword().equals(password)) {
                    p.changeMoney(money);
                    System.out.println("Ditt nya saldo är: " + p.viewMoney());
                } else {
                    System.out.println("Fel lösenord");
                }
                return;
            }
        }
        System.out.println("Namnet finns inte");
    }
}