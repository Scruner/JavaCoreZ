package lesson_13;

public class Test1 {

}

class Student {
    int grade;

    public Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(4);
        if (st1.grade == 2) {
            System.out.println("Student dvoechnik");
        } else if (st1.grade == 3) {
            System.out.println("Student troechnik");
        } else if (st1.grade == 4) {
            System.out.println("Student horoshist");
        } else if (st1.grade == 5) {
            System.out.println("Student otlichnik");
        } else {
            System.out.println("The grade not real");
        }

        switch (st1.grade) {
            case 2:
                System.out.println("Student dvoechnik");
                break;
            case 3:
                System.out.println("Student troechnik");
                break;
            case 4:
                System.out.println("Student horoshist");
                break;
            case 5:
                System.out.println("Student otlichnik");
                break;
            default:
                System.out.println("The grade not real");
        }
    }
}
