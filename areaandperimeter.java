import java.util.Scanner;
public class areaandperimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle : ");
        float length = sc.nextFloat();
        System.out.print("Enter the width of the rectangle : ");
        float width = sc.nextFloat();

        float perimeter = 2*(length+width);
        float area = length*width;

        System.out.println("The perimeter of the rectangle = "+perimeter);
        System.out.println("The area of the rectangle = "+area);
    }
}
