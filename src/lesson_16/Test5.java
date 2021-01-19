package lesson_16;

public class Test5 {

}

class Employee {
    double salary;
    boolean isManager;

    Employee(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }

}

class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(100.5, true);
//        System.out.println(employee.isManager + employee.salary);
        System.out.println("On manager? " + employee.isManager + " Ego zar plata: " + employee.salary);
    }
}
