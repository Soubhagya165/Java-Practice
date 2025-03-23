class Car {
    String brand;
    double price;
    String color;
    static int wheel;

    Car(String s, double d, String c) {
        this.brand = s;
        this.price = d;
        this.color = c;
    }

    static {
        wheel = 4;
    }

    public void display(){
        System.out.println("The brand of Car is : "+brand);
        System.out.println("The Price of car is : "+price);
        System.out.println("The color of car is : "+color);
        System.out.println("The wheels of the car is : "+wheel);
        System.out.println();
    }
}

public class CaridCreate {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 270000, "Red");
        Car c2 = new Car("Audi", 400000, "Blue");
        Car c3 = new Car("Mercedes", 600000, "Violet");

        c1.display();
        c2.display();
        c3.display();
    }
}
