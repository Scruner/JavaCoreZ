package lesson_16;

public class Test8 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Uraaaaaa!!!";
        //здесь объект не меняется
        s1.concat(s2).trim().replace("Uraaaaaa!!!", "УРА!!!").substring(6, 9);
        System.out.println(s1);
        //чтобы объект поменялся нужно присвоить его новой переменной
        String s3 = s1.concat(s2).trim().replace("Uraaaaaa!!!", "УРА!!!").substring(6, 9);

        System.out.println(s3);
        System.out.println(s1.substring(s1.indexOf('W')));
    }
}
