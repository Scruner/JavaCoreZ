package lesson_18;

public class Test6 {
    public static void main(String[] args) {
        char[] array = {'p', 'r', 'i', 'v', 'e', 't'};
        String s = new String(array);
        System.out.println(s);

        StringBuilder stringBuilder = new StringBuilder("Hello World");
        //добавляем часть строки (символы чар) из массива char, со второй позиции добавляем три элемента
        // итог Hello Worldive
        stringBuilder.append(array, 2, 3);
        System.out.println(stringBuilder);

        //добавляем часть строки (символы чар) во вторую позицию, что добавляем? - массив array с первой позиции, три элемента
        // итог Herivllo Worldive
        stringBuilder.insert(2, array, 1, 3);
        System.out.println(stringBuilder);
    }
}
