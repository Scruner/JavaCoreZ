package lesson_14;

public class Test5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println(i);
        }
        for (int i = 1; i <= 100; i++) {
            if (i == 87 || i == 90) {
                continue;
            }
            System.out.println(i);
        }

        for (int i = 1; i <= 100; i++) {
            if (i == 10) {
                continue;
            }
            if (i % 55 == 0) {
                break;
            }
            System.out.println(i);
        }
    }
}
