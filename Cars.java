import java.util.Scanner;

class Car{
    String color;
    int Mileage;
    double speed;

    public void display(String x,int y,double z){
        System.out.println("The Color of the Car is "+x);
        System.out.println("The Mileage of the Car is "+y);
        System.out.println("The speed of the Car is "+z);
        System.out.println();
    }

    public static void displaycars(Car x)
    {
        System.out.println(x);
    }


    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Car bmw = new Car();
        // Car audi = new Car();
        bmw.color = "Red";
        bmw.Mileage = 45;
        bmw.speed = 30.65;
        // bmw.display(bmw.color,bmw.Mileage,bmw.speed);
        displaycars(bmw);
        // audi.color = sc.next();
        // audi.Mileage = sc.nextInt();
        // audi.speed = sc.nextDouble();
        // audi.display(audi.color, audi.Mileage, audi.speed);
    }
}
