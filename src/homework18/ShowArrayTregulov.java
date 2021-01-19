package homework18;

public class ShowArrayTregulov {
    public static void showArray(String[][] array) {

        //чтобы красиво вывести на экран массив, сначала выводим на экран фигурную скобку. Это начало двумерного массива.
        System.out.print("{ ");

        //затем начинает работу цикл. Здесь array.length означает длинну двумерного массива (это сколько одномерных массивов
        //содержит данный многомерный массив. К примеру наш массив содержит три одномерных массива {{"a","b"},{"c"},{"d","e"}}
        //array.length = 3
        for (int i = 0; i < array.length; i++) {

            //здесь рисуем вторую открывающую фигурную скобку
            System.out.print("{");

            //начинается второй цикл. array[i] - это нулевой индекс многомерного массива, в нашем примере он равен {"a","b"},
            //его длина 2, поэтому пока j<2, мы выполняем тело внутреннего цикла. Вторая итерация j=1, проверяем 1<2 ? - да,
            //заходим в тело
            for (int j = 0; j < array[i].length; j++) {

                //это условие говорит, если j не равен 2 - 1 (то есть одному). Во второй иттерации проверяем 1 не равен 1? -
                //равен. Условие отрицания false, поэтому дальше выполняется else
                if (j != array[i].length - 1) {

                    //тогда вывожу на экран элемент array 00 (то есть "a") и ставлю запятую. То есть если индекс элемента
                    //не равен индексу последнего элемента, тогда надо ставить запятую
                    System.out.print(array[i][j] + ", ");

                    //если элс не выполняется, начинается новая итерация внутреннего цикла. Во второй иттерации это будет
                    //вывод на экран 01 (то есть "b")
                } else {
                    System.out.print(array[i][j]);
                }
            }
            //проверка i не равен длинна всего массива минус 1. А i у нас равна 0. То есть 0 не равен 2? - нет, тогда
            //выводим на экран закрывающую фигурную скобку и запятую. Принцип тот же, что и в верхней проверке, если
            //i равен последнему элементу,то просто будет ставится фигурная скобка и запятая уже ставиться не будет
            if (i != array.length - 1) {
                System.out.print("}, ");
            } else {
                System.out.print("}");
            }
        }
        System.out.println(" }");
    }

    public static void main(String[] args) {
        String array[][] = {{"apple", "orange"}, {"hello", "goodbye", "ok"}, {"car"}};
        showArray(array);
        showArray(new String[][]{{"man", "woman"}, {"male", "famale"}});
    }
}