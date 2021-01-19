package lesson_17;

class Car {

}

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good day!!!");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb3);

        System.out.println(sb2.length());
        System.out.println(sb2.charAt(4));
        System.out.println(sb2.indexOf(" "));
        System.out.println(sb2.indexOf("o", 2));

        String s = sb2.substring(5);
        System.out.println(s);
        String s2 = sb2.substring(5, 8);
        System.out.println(s2);

        System.out.println(sb2.subSequence(5, 8));

//        sb2.append(22);
//        System.out.println(sb2);
//        sb2.append(true);
//        System.out.println(sb2);
//        sb2.append(sb2);
//        System.out.println(sb2);
//        sb2.append("Hello");
//        System.out.println(sb2);
//        sb2.append(new Car());
//        System.out.println(sb2);

//        System.out.println(sb2.insert(4,55));
        System.out.println(sb2.insert(sb2.length(), "Hello"));

        StringBuilder sb10 = new StringBuilder("Hellw World");
//        sb10.delete(3, 6);
//        System.out.println(sb10);

        sb10.deleteCharAt(6);
        System.out.println(sb10);

        sb10.reverse();
        System.out.println(sb10);

        StringBuilder sb12 = new StringBuilder("Vsem privet i hana");
        sb12.replace(4,9," VDV ");
        System.out.println(sb12);

        System.out.println(sb12.capacity());
        System.out.println(sb1.capacity());
    }

}
