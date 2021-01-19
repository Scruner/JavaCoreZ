package lesson_14;

public class Test6 {
    public void time() {
        OUTER:
        for (int chas = 0; chas <= 23; chas++) {
            System.out.println("Начало outer loopa");

            INNER:
            for (int minuta = 0; minuta <= 59; minuta++) {
                if (minuta == 30) {
                    continue OUTER;
                }
                if (minuta == 20) {
                    break;
                }
                System.out.println(chas + ":" + minuta);

            }

            System.out.println("Конец outer loopa");
        }
    }

    public static void main(String[] args) {
        Test6 test6 = new Test6();
        test6.time();
    }
}

