package lesson_16;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");
        String s2 = new String("privet");

        String s10 = s1.substring(3);
        System.out.println(s10);
        System.out.println(s1);

        String s11 = s1.substring(3, 7);
        System.out.println(s11);

        String s12 = s1.trim();
        System.out.println(s12);

        String s13 = s2.replace('r', 'Z');
        System.out.println(s13);
        System.out.println(s2);

        String s14 = s2.replace("vet", "vivka");
        System.out.println(s14);

//        String s3 = "poka";
//        String s4 = s3.replace('k', 'k');
//        System.out.println(s3 == s4);

        String s3 = "poka";
        String s4 = s3.replace('k', 'r');
        System.out.println(s3 == s4);

        String s5 = "privet, ";
        String s6 = "drug";
        System.out.println(s5.concat(s6));
        System.out.println(s5 + s6);
    }
}
