package homework10_p1.homework10_p2.homework10_p3;

public class C {
    public int a;
    public int b;
    public String name;
    public String surname;

    public C(int a, int b, String name, String surname) {
        this.a = a;
        this.b = b;
        this.name = name;
        this.surname = surname;
    }

    public void showHuman(String name, String surname, int age, int studyCourse) {
        System.out.println(name + "\n" + surname + "\n" + age + "\n" + studyCourse + "\n");

    }
}
