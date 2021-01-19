package homework18;

import java.util.Arrays;

public class SortBubble {
    public static int[] sortirovka(int[] array) {
        //создаю счётчик, он понадобится позже
        int count;
        //создаю цикл do while
        do {
            //в теле цикла инициализирую счётчик
            count = 0;

            //прохожу по массиву от первого элемента до предпоследнего (последний брать не буду)
            for (int i = 0; i < array.length - 1; i++) {
                //сравниваю первый элемент с последующим
                if (array[i] > array[i + 1]) {
                    //создаю переменную temp, в которую кладу значение array[i]
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    //добавляю счётчик
                    count++;
                }
            }
        } while (count > 0);
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 34, 12, 34, -7};
        sortirovka(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}

