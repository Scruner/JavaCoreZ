package com.company.homework5;

public class Human {
    String name;
    Car3 car;
    BankAccount bA;

    void info() {
        System.out.println("Имя: " + name + " цвет машины: " + car.color + " баланс банковского счёта: " +
                bA.balance);
    }
}

class HumanTest {

    public static void main(String[] args) {

        Human h = new Human();
        h.name = "Devid";
        h.car = new

                Car3("red", "V8");

//        h.bA = new
//
//                BankAccount(18, 200.3);
        h.info();
    }
}

class Car3 {
    Car3(String c, String e) {
        color = c;
        engine = e;
    }

    String color;
    String engine;
}

class BankAccount {
    int id;
    String name;
    double balance;

    BankAccount(int id2, String name, double balance2) {
        id = 10;
        name = "Scruner";
        balance = 27.9;
    }

    void popolnenieScheta(double summPlus) {
        System.out.println("Баланс до пополнения: " + balance);
        System.out.println("Пополняем баланс на " + summPlus);
        System.out.println("Баланс после пополнения: " + (balance += summPlus));
        System.out.println();
    }

    void snyatieSoScheta(double summMinus) {
        System.out.println("Баланс до снятия: " + balance);
        System.out.println("Снимаем с баланса " + summMinus);
        System.out.println("Баланс после снятия: " + (balance -= summMinus));
    }
}

class BanckAccountTest {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(1, "Aga", 23.4);
        bankAccount.popolnenieScheta(45.3);
        bankAccount.snyatieSoScheta(12.7);
    }
}