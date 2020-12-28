package com.company.lesson_6;

public class Employee {

    public Employee(int id2, String surname2, int age2) {
        this(id2, surname2, age2, 0.0, null);

    }

    public Employee(String surname3, int age3) {
       this(0, surname3, age3, 0.0, null);
    }

    public Employee(int id4, String surname4, int age4, double salary4, String department4) {
        this.id = id4;
        this.surname = surname4;
        this.age = age4;
        this.salary = salary4;
        this.department = department4;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Ivanov", 7);
        Employee employee2 = new Employee("Levin", 86);
        Employee employee3 = new Employee(1, "Sidorov", 7, 300.2, "IT");

        System.out.println(employee1.surname);
        System.out.println(employee2.age);
        System.out.println(employee3.id
                + System.lineSeparator() + employee3.surname
                + System.lineSeparator() + employee3.age
                + System.lineSeparator() + employee3.salary
                + System.lineSeparator() + employee3.department);
    }
}