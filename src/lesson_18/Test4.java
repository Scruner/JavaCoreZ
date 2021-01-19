package lesson_18;

public class Test4 {
    public static void main(String[] args) {
        int array1[] = {1, 9, 3, -8, 0, 5, 4, 1};
        int array2[] = {1, 9, 3, -8, 0, 5, 4, 1};
        int array3 [] = array2;

        //вот так меняем первый элемент массива на другое число, в данном случае 0;
        array1[1]=0;
        //или вот так можно на месте индекса производить какие-либо действия
        array2[5-3]=3;

        System.out.println(array1==array2);
        System.out.println(array1.equals(array2));

        System.out.println(array3==array2);
        System.out.println(array3.equals(array2));
    }
}
