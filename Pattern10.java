import java.util.Scanner;

public class Pattern10 {
    public static class Newpattern {
        void display() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter no of rows : ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) 
            {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }

                
                for (int k = i; k >0 ; k--) {
                    System.out.print(k+" ");
                }

                for(int l = 2;l<=i;l++)
                {
                    System.out.print(l+" ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Newpattern obj = new Newpattern();
        obj.display();
    }
}
