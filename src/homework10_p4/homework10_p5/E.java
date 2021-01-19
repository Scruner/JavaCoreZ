package homework10_p4.homework10_p5;

public class E {
    public int age = 23;
    public int money = 9000;
    public String name = "Atila";
    public String surname = "Anatolev";

    public E(int age, int money, String name, String surname) {
        this.age = age;
        this.money = money;
        this.name = name;
        this.surname = surname;
    }

    public String infoHumanName() {
        return name;
    }

    public static String infoHumanSurname(String surname) {
        return surname;
    }

    public int infoHumanAge() {
        return age;
    }

    public int infoHumanMoney() {
        return money;
    }
}
