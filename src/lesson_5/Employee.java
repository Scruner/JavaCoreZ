package lesson_5;

public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id, String surname, int age, double salary, String department) {
        id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    void salaryPlus() {
        System.out.println("Увеличенная зарплата: " + salary * 2);
    }
}

class EmployeeTest {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Dick", 5, 23.4, "IT");
        Employee employee2 = new Employee(2, "Nick", 7, 75.3, "Ximera");

        employee1.salaryPlus();
        employee2.salaryPlus();
    }
}