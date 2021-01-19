package homework16;

public class Post {

    public void email(String s) {
        int a = 0;//позиция символа @
        int b = 0;//позиция символа .
        int c = 0;//позиция символа ;

        while (c < s.length() -1) {

            a = s.indexOf('@', c);
            b = s.indexOf(".", c);
            c = s.indexOf(";", c+1);
            System.out.println(s.substring(a+1, b));
        }

    }
//
//            if (s.endsWith("@yahoo.com;")) {
//                System.out.println("yahoo");
//            } else if (s.endsWith("@mail.ru;")) {
//                System.out.println("mail");
//            } else if (s.endsWith("@gmail.com;")) {
//                System.out.println("gmail");
//            }
//        }

    public static void main(String[] args) {
        Post post = new Post();
        post.email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}

