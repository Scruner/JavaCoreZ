package homework11;

public class CarTest {

    public int changeDoors(Car c, int doors) {
        return c.quantityDoors = doors;
    }

    public void changeColor(Car car1, Car car2) {
        String color = car1.color;
        car1.color = car2.color;
        car2.color = color;
        System.out.println("Цвет перовй машины " + car1.color + ", \nЦвет второй машины " + car2.color);
    }

    public static void main(String[] args) {
        CarTest carTest = new CarTest();
        Car car3 = new Car("red","V6", 2);
        Car car4 = new Car("blue","V8", 4);

        System.out.println("Новое количество дверей в первой машине " + carTest.changeDoors(car3,3) + ", \nНовое " +
                "количество дверей во второй машине " + carTest.changeDoors(car4,5) +", \nДвигатель первой машины "
                + car3.engine + ", \nДвигатель второй машины " + car4.engine);
        carTest.changeColor(car3, car4);

    }
}
