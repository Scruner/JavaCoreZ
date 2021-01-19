package homework13;

public class Month {

        public static void countMonth(int d) {

            switch (d) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("In this month 31 days");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("In this month 30 days");
                    break;
                case 2:
                    System.out.println("In this month 28 days");
                    break;
                default:
                    System.out.println("This month is not realy");
            }
        }
                public static void main(String[] args) {
            countMonth(1);
            Month.countMonth(2);
            countMonth(25);
            Month.countMonth(-9);
            countMonth(7);

//        switch (count) {
//            case 1:
//                System.out.println("This Janyary 31 days");
//                break;
//            case 2:
//                System.out.println("This Fabrary 28 days");
//                break;
//            case 3:
//                System.out.println("This Martch 31 days");
//                break;
//            case 4:
//                System.out.println("This April 30 days");
//                break;
//            case 5:
//                System.out.println("This May 31 days");
//                break;
//            case 6:
//                System.out.println("This June 30 days");
//                break;
//            case 7:
//                System.out.println("This July 31 days");
//                break;
//            case 8:
//                System.out.println("This Augast 31 days");
//                break;
//            case 9:
//                System.out.println("This Septrmber 30 days");
//                break;
//            case 10:
//                System.out.println("This October 31 days");
//                break;
//            case 11:
//                System.out.println("This November 30 days");
//                break;
//            case 12:
//                System.out.println("This December 31 days");
//                break;
//            default:
//                System.out.println("This month is not realy");
        }

}
