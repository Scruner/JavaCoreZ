package lesson_14;

public class Test2 {
    public static void main(String[] args) {
        for (int i = 1, j =2, k=10; i < 11 && i>3; i++, j++, k=k+20, abc(10)) {
            System.out.println(i+j);
        }

        for (int i = 5; i < 11; i++,abc(10)) {
            System.out.println(i);
        }

        for (int i = 1; i < 11;) {
            System.out.println(i);
            i++;
        }

        for (int i = 1; ; i++) {
            System.out.println(i);
        }
    }

    static void abc(int n) {
        System.out.println(n);
    }
}
