package lesson_12;

public class Test10 {

    void maximum(int i1, int i2, int i3) {
        if (i1 > i2 && i1 > i3) {
            System.out.println("Maximun - " + i1);
        } else if (i2 > i1 && i2 > i3) {
            System.out.println("Maximum - " + i2);
        } else {
            System.out.println("Maximum - " + i3);
        }
    }

    void abc() {
        String str;
        int a = 10;
        if (a >= 10) {
            str = "Privet";
        }
        if (a < 10) {
            str = "Poka";
        } else {
            str = null;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        int a = 30;
        boolean b = true;
        int salary = 300;

        if (salary < 200) {
            System.out.println(":(((");
        } else if (salary < 400 && b == false || !true) {
            System.out.println(":|||");
        } else if (salary < 600) {
            System.out.println(":)))");
        } else {
            System.out.println(":D)))!!!!");
        }
        Test10 t = new Test10();
        t.maximum(4, 7, 0);

        int c = 30;
        int d = 20;
        int maximum = (c > d) ? c : d;
        System.out.println(maximum);

    }
}
