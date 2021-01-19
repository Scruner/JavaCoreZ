package homework7;

public class Employee {

    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee(int id2) {
        this.id = id2;

    }

    Employee(String surname3) {
        this.surname = surname3;
    }

    private Employee(double salary4) {
        this.salary = salary4;
    }

    public void getSalary() {
        System.out.println(salary);
    }

    public void getSurname() {
        System.out.println(surname);
    }

    public void getId() {
        System.out.println(id);
    }

}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1);
        Employee employee2 = new Employee("Levin");
        // Employee employee3 = new Employee(300.2);

        employee1.getId();
        employee2.getId();
        //employee3.getId();

        employee1.getSurname();
        employee2.getSurname();
        //employee3.getSurname();

        employee1.getSalary();
        employee2.getSalary();
        //employee3.getSalary();

        System.out.println(employee1.id);
        System.out.println(employee2.id);
        //System.out.println(employee3.id);

        System.out.println(employee1.surname);
        System.out.println(employee2.surname);
        //System.out.println(employee3.surname);

        //System.out.println(employee1.salary);
        //System.out.println(employee2.salary);
        //System.out.println(employee3.salary);

    }
}