package lesson_18;

public class Test5 {
    public static void maxMin(double[] array) {
        double max = array[0];
        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальный элемент массива: " + min + "\n" + "Максимальный элемент массива: " + max);

    }

    public static void main(String[] args) {
        double[] array = {2.2, 3.3, -4.3, 5.5, 6.3, 6.7, 2.5, 12.9, 17.7};
        maxMin(array);
        maxMin(new double[]{2.2, 3.3, -4.3, -78.05});
    }
}
