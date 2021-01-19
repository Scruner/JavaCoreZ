package homework18;

public class MySortirovka2 {

    public static int[] sortirovka(int[] array) {

        int count;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                count = array[i];
                array[i] = min;
                array[index] = count;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {64, 92, 2, 78, -41, 31, 34, 17, 45, -78, 42, 7, 77, 0};
        sortirovka(array);
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.print("]");
        System.out.println();
    }
}

