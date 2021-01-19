package lesson_8;

public class Car {
    String color = "blue";
    String engine = "V6";

}
 class Human {
    String name = "Ivan";
    Car car = new Car();

     public static void main(String[] args) {
         Human human1 = new Human();
         human1.car=new Car();
         human1.car=new Car();
         human1.car.engine="V8";
     }
 }
