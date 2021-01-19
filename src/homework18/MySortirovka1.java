package homework18;

public class MySortirovka1 {
    public static int[] sortirovka(int[] arr) {
        int count;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            if (i != index) {
                count = arr[i];
                arr[i] = min;
                arr[index] = count;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 56, -8, -78, 0};
        sortirovka(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
