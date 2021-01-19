package lesson_5;

public class Car2 {

    String color;
    String engine;
    int speed;

    int gas(int skorost) {
        speed += skorost;
        return speed;
    }

    int tormoz(int skorost) {
        speed -= skorost;
        return speed;
    }

    void showInfo() {
        System.out.println("cvet: " + color + " motor: " + engine + " skorost " + speed);
    }
}

class Car2Test {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color = "white";
        c1.speed = 70;
        c1.engine = "V8";

        c1.showInfo();

        c1.gas(60);
        c1.showInfo();

        c1.tormoz(120);
        c1.showInfo();
    }
}