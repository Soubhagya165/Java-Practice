import java.util.Scanner;
public class fibonacci {
    public static class Fibonacciseries {
        void display() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter 1st interval ");
            int m = sc.nextInt();
            
            System.out.print("Enter 2nd Interval : ");
            int n = sc.nextInt();
    
            int a = 0;
            int b = 1;
            int next;
    
            for(int i = 0;i<=n;i++)
            {
                if(a >=m && a <=n){
                    System.out.print(a+" ");
                }
                next = a+b;
                a = b;
                b = next;
            }

        }
    }
    public static void main(String[] args) {
       Fibonacciseries obj = new Fibonacciseries();
       obj.display();
    }
}
