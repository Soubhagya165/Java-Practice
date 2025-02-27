import java.util.Scanner;
public class variables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String c = sc.nextLine();
        System.out.print("Enter an Integer : ");
        int a = sc.nextInt();
        System.out.print("Enter a float value : ");
        float b = sc.nextFloat();
        System.out.print("Enter a double value : ");
        double d = sc.nextDouble();
        System.out.print("Enter a character : ");
        char e = sc.next().charAt(0);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
