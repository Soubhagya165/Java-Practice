import java.util.Scanner;

public class sumandaverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.print("Enter another number : ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number : ");
        int c = sc.nextInt();

        int sum = a+b+c;
        System.out.println("The sum is : "+sum);
        double avg = sum/3;
        System.out.println("The avg is : "+avg);
    }
}
