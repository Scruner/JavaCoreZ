package homework14;

public class Test {

    public static void time() {
        OUTER:for (int hours = 0; hours < 7; hours++) {
            MIDDLE:for (int minuts = 0; minuts < 60; minuts++) {
                if (hours > 1 && minuts % 10 == 0) {
                    break OUTER;
                }
                INNER:for (int seconds = 0; seconds < 60; seconds++) {
                    if (seconds * hours > minuts) {
                        continue MIDDLE;
                    }
                    System.out.println(hours + ":" + minuts + ":" + seconds);
                }
            }
        }
    }

    public static void main(String[] args) {
        time();
    }
}
