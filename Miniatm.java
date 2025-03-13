import java.util.Scanner;

public class Miniatm {
    public static void main(String[] args) {
        int y;
        do {
            Scanner sc = new Scanner(System.in);
            int password;
            do {
                System.out.print("Enter a valid password : ");
                password = sc.nextInt();
            } while (password != 1234);

            int amount = 10000;
            System.out.println("Enter an Operation : ");
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Check balance");
            System.out.println("4.Exit");
            y = sc.nextInt();
            switch (y) {
                case 1:
                    System.out.print("Enter amount to withdraw : ");

                    int withdraw = sc.nextInt();
                    if(withdraw%100 == 0)
                    {
                    if (withdraw > 0 || withdraw < 10000) {
                        int a = withdraw / 2000;
                        System.out.println("The number of 2000 notes = " + a);
                        int b = withdraw - a * 2000;
                        int c = b / 500;
                        System.out.println("The number of 500 notes = " + c);
                        int d = b - c * 500;
                        int e = d / 100;
                        System.out.println("THe number of 100 notes = " + e);
                        int g = amount - withdraw;
                        System.out.println("The Remaining balance = " + g);
                    } 
                }
                else {
                    System.out.println("\nEnter the amount Divisible by 100");
                    break;
                }
                    break;
                case 2:
                    System.out.print("Enter amount to deposit : ");
                    int z = sc.nextInt();
                    int m = amount + z;
                    System.out.println("After depositing the new amount = " + m);
                    break;
                case 3:
                    System.out.println("The Remaining balance = " + amount);
                    break;
                case 4:
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Enter a valid Statement : ");
            }
            System.out.println("  ");
        } while (y != 4);
    }
}
