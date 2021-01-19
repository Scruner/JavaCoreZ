package lesson_8;

public class Student {
    String name;
    int course;
    static int count;
    int a;

    public Student(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student #" + count + " create");

    }

    public static void showCount() {
        System.out.println("Vsego sozdano students " + count);
    }

    public void showInfo() {
        System.out.println("Welcome to the Student class!!!");
    }

    void abc() {
        a++;
        count++;
    }

    static void abcd() {
        count++;
        Student student2 = new Student("Petr", 1);
        student2.a++;
    }

    public static void main(String[] args) {
        abcd();
        Student student = new Student("Vova", 3);
        student.abc();
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 1);
        Student student2 = new Student("Stepan", 2);
        Student student3 = new Student("Masha", 4);

        System.out.println(student1.name);
        System.out.println(Student.count);
    }
}
