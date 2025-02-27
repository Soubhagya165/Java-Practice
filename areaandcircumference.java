import java.util.Scanner;
public class areaandcircumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the Circle : ");
        int radius = sc.nextInt();

        double circumference = 2*3.14*radius;
        double area = 3.14*radius*radius;

        System.out.println("The Circumference of the Circle = "+circumference);
        System.out.println("The Area of the Circle = "+area);
    }
}
