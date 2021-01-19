package homework17;

public class RavenstvoTregulov {
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        //создаём переменную boolean и приравниваем её к trut
        boolean result = true;

        //проверяем длины стрингбилдеров на равенство, если одинаковы, то мы продолжаем проверку, если разные - то уже
        //на этом этапе понятно, что объекты разные
        if (sb1.length() == sb2.length()) {

            //в этом цикле можно проходить хоть по первому, хоть по второму объекту. Их длины равные, поэтому ничего бы
            //не изменилось
            for (int i = 0; i < sb1.length(); i++) {
                //проверяю равенство каждого чара на каждой позиции объектов, начниная с 0. Если эти чары не равны, значит не равны и
                //объекты возвращаем false и выходим из цикла.
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        //этот раздел выходит когда длины объектов разные.
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        StringBuilder sb3 = new StringBuilder("Hello");
        StringBuilder sb4 = new StringBuilder("Hello");
        StringBuilder sb5 = new StringBuilder("hello");

        //приравниваю output метода ravenstvo к переменной а
        boolean a = ravenstvo(sb3, sb4);
        System.out.println(a);
        System.out.println(ravenstvo(sb5, sb4));
        System.out.println(ravenstvo(new StringBuilder("Hello"), new StringBuilder("hello")));
        System.out.println(ravenstvo(new StringBuilder(""), new StringBuilder("")));
        System.out.println(ravenstvo(new StringBuilder(), new StringBuilder()));

    }
}
