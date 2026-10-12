public class Demo {
    public static void main(String[] args) {
        System.out.print("Hello World!");

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.brand = "BMW";
        car2.brand = "Mercedes-Benz";
        car3.brand = "Audi";

        car1.color = "Red";
        car2.color = "Blue";
        car3.color = "Green";


        car1.drive();
        car2.drive();
        car3.drive();
    }
}

class Car {
    String brand;
    String color;

    void drive() {
        System.out.println("Driving the car....");
    }
}
