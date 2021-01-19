package homework10_p4;

import homework10_p1.A;
import homework10_p1.homework10_p2.*;
import homework10_p1.homework10_p2.homework10_p3.C;
import homework10_p4.homework10_p5.E;

public class D {

    public static void main(String[] args) {
        A t = new A(3, 5, "Ivan");
        B t2 = new B();
        C t3 = new C(7, 4, "Petr", "Sidorov");
        E t4 = new E(90, 54, "Dima", "Nikolaev");

        t.a = 10;
        t.b = 30;
        t.name = "John";

        t2.a = 20;
        t2.name = "Alex";

        t3.a = 25;
        t3.b = 17;
        t3.name = "Vasya";
        t3.surname = "Golikov";

        t3.showHuman("Petr", "Sidorov", 78, 34);

        System.out.println(t4.infoHumanName());
        System.out.println(t4.infoHumanAge());
        System.out.println(t4.infoHumanMoney());
        System.out.println(t4.surname);

    }
}
