package homework17;

public class Test1 {
    public static boolean ravenstvo(StringBuilder stringBuilder1, StringBuilder stringBuilder2) {
        boolean result = true;
        if (stringBuilder1.length() == stringBuilder2.length()) {
            for (int i = 0; i < stringBuilder1.length(); i++) {
                if (stringBuilder1.charAt(i) != stringBuilder2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        StringBuilder st1 = new StringBuilder("Hello");
        StringBuilder st2 = new StringBuilder("Hello");
        StringBuilder st3 = new StringBuilder("hello");

        boolean a = ravenstvo(st1, st2);
        System.out.println(a);

        System.out.println(ravenstvo(new StringBuilder(" "), new StringBuilder("")));
    }
}
