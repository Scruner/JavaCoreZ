package lesson_17;

public class Test2 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = sb1.append("45");
        sb2 = sb2.append("6").append("7");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb2 = " + sb2);

        //Метод equls в StringBulder работает не так, как в String. Здесь он работает также как ==
        StringBuilder sb3 = new StringBuilder("123");
        StringBuilder sb4 = new StringBuilder("123");
        StringBuilder sb5 = sb3;
        System.out.println(sb3 == sb4);
        System.out.println(sb3.equals(sb4));
        System.out.println(sb3.equals(sb5));

        String s3 = new String("123");
        String s4 = new String("123");
        String s5 = s3;
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println(s3.equals(s5));
    }
}
