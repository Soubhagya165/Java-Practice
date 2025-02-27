import java.util.Scanner;

public class celciustof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature in Celcius : ");
        int a = sc.nextInt();

        double farenheit = (a*1.8)+32;
        System.out.println("The temp is : "+farenheit);
    }
}
