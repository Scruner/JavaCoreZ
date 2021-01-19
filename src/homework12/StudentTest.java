package homework12;

import lesson_11.Student;

public class StudentTest {

    public static void comparisonStudents(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Students are equal");
        } else {
            System.out.println("Students are not equal");
        }
    }

    public static void comparisonStudentsSpecifications(Student student1, Student student2) {
        if (student1.name.equals(student2.name)) {
            System.out.println("The names students are equal");
            if (student1.course == student2.course) {
                System.out.println("The course students are equal");
                if (student1.grade == student2.grade) {
                    System.out.println("The grades students are equal. Means students are equal");
                } else {
                    System.out.println("The grades not equal. Means students are " +
                            "not equal");
                }
            } else {
                System.out.println("The course not equal. Means students are " +
                        "not equal");
            }
        } else {
            System.out.println("The names, course and grades students are not equal. Means students are not equal");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alexey", 3, 5.3);
        Student student2 = new Student("Alexey", 3, 5.3);
        Student student3 = new Student("Dmitriy", 5, 7.3);
        Student student4 = new Student("Olga", 4, 3.7);

        comparisonStudents(student3, student4);
        comparisonStudentsSpecifications(student1, student2);
    }
}
