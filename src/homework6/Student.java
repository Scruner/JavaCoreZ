package homework6;

public class Student {

    int id;
    String name;
    String surname;
    int yearStudy;
    int averaitinMath;
    int averaitinEconom;
    int averaitinLang;

    public Student(int id, String name, String surname, int yearStudy, int averaitinMath, int averaitinEconom,
                   int averaitinLang) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.yearStudy = yearStudy;
        this.averaitinMath = averaitinMath;
        this.averaitinEconom = averaitinEconom;
        this.averaitinLang = averaitinLang;
    }

    public Student(int id, String name, String surname, int yearStudy) {
        this(id, name, surname, yearStudy, 0, 0,
        0);
    }

    public Student() {

    }
}

class StudentTest {
    public static void main(String[] args) {

        Student student4 = new Student();
        Student student5 = new Student(1, "Alex", "Stax", 3);
        Student student6 = new Student(2, "Iov", "Birdy", 3, 4,
                5,3);

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        StudentTest studentTest = new StudentTest();

        student1.name = "Max";
        student2.name = "Stiv";
        student3.name = "Volodya";

        student1.averaitinMath = 5;
        student1.averaitinEconom = 4;
        student1.averaitinLang = 3;

        student2.averaitinMath = 3;
        student2.averaitinEconom = 4;
        student2.averaitinLang = 2;

        student3.averaitinMath = 2;
        student3.averaitinEconom = 2;
        student3.averaitinLang = 3;

        System.out.println("Средняя арифметическая оценка " + student1.name + ": " + (student1.averaitinMath + student1.averaitinEconom + student1.averaitinLang) / 3);
        System.out.println("Средняя арифметическая оценка " + student2.name + ": " + (student2.averaitinMath + student2.averaitinEconom + student2.averaitinLang) / 3);
        System.out.println("Средняя арифметическая оценка " + student3.name + ": " + (student3.averaitinMath + student3.averaitinEconom + student3.averaitinLang) / 3);

        studentTest.averaitinRaiting(student1);
        studentTest.averaitinRaiting(student2);
        studentTest.averaitinRaiting(student3);
    }

    void averaitinRaiting(Student student) {
        System.out.println((student.averaitinMath + student.averaitinEconom + student.averaitinLang) / 3);
    }
}