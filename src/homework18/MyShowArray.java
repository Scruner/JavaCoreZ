package homework18;

public class MyShowArray {
    public static void showArray(String[][] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length - 1) {
                    System.out.print(array[i][j] + ", ");
                } else {
                    System.out.print(array[i][j]);
                }
            }
            if (i != array.length - 1) {
                System.out.print("}, ");
            } else {
                System.out.print("}");
            }
        }
        System.out.print("}");
    }

    public static void main(String[] args) {
        String[][] array = {{"apple", "orange","peach"},{"ball","scotch"},{"bros", "sister", "sin"}};
        showArray(array);
    }
}
