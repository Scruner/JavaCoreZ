package homework18;

public class SortBubble1 {

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {64, 92, 2, 78, -41, 31, 34, 17, 45, -78, 42, 7, 77, 0};

        printArray(array);

        //создаём метку(флажок) что массив отсортирован
        boolean isSorted = false;
        //условие, пока массив не отсортирован
        while (!isSorted) {
            //считаем, что массив отсортирован
            isSorted = true;

            for (int i = 1; i < array.length; i++) {
                //если правый элемент меньше, чем левый
                if (array[i] < array[i - 1]) {
                    //то мы меняем их местами, через временную переменную, int temp
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    //если происхоит как-нибудь перестановка, сбрасываем флажок обратно в false
                    isSorted = false;
                }
            }
            printArray(array);
        }
    }
}
