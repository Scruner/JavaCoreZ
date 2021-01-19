package lesson_16;

public class Test11 {
    public static void main(String[] args) {
        String x = "privet";
        String y = "privet".trim();
        System.out.println(x == y);
        System.out.println(x.equals(y));

        String y1 = "   privet".trim();
        System.out.println(x == y1);
        System.out.println(x.equals(y1));
    }
}
