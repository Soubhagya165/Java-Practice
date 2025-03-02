import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of series : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int next;

        for(int i = 1;i<=n;i++)
        {
            System.out.print(a+" ");
            next = a+b;
            a = b;
            b = next;
        }
    }
}
