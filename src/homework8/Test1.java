package homework8;

public class Test1 {

    public static final double Pi = 3.14;

    public double radiusCicle(double r) {
        return Pi * r * r;
    }

    static double lengthCicle(double r2) {
        return 2 * Pi * r2;
    }

    public void showInfo(double r3) {
        System.out.println("Радус круга = " + r3 + "\n" +
                "Площадь круга = " + radiusCicle(r3) + "\n" +
                "Длина окружности = " + lengthCicle( r3));
    }

    static double getMultiplication(double a, double b, double c) {
        return a * b * c;
    }

    static void getDivison(int a, int b) {
        System.out.println("Целое частное = " + a / b +
                "; Остаток = " + a % b);
    }
}

class Test2 {
    public static void main(String[] args) {
        System.out.println(Test1.getMultiplication(2, 3, 5));
        System.out.println(Test1.getMultiplication(5.3, 9.7, 7));
        Test1.getDivison(56, 9);
        Test1.getDivison(43, 7);
        System.out.println();

        Test1 test1 = new Test1();

        test1.radiusCicle(5);
        Test1.lengthCicle(8);
        test1.showInfo(7);
    }
}
