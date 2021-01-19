package homework15;

public class Test {

    public static void time() {
        int hour = 0;
        int minuts = 0;
        int seconds = 0;

        OUTER:
        while (hour < 6) {
            if (hour > 1 && minuts % 10 == 0) {
                break OUTER;

            }
            MIDDLE:
            do {
                INNER:
                while (seconds < 60) {
                    if (seconds * hour > minuts) {
                        minuts++;
                        seconds = 0;
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + minuts + ":" + seconds);
                    seconds++;
                }
                seconds=0;
                minuts++;
            }
            while (minuts < 60);
            minuts=0;
            hour++;
        }
    }

    public static void main(String[] args) {
        time();
    }
}
