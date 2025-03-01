import java.util.Scanner;

class Diagonalsum{
    void display(int n){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[n][n];

        for(int i = 0;i<arr.length;i++)
        {
            for(int j = 0;j<arr.length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0;i<arr.length;i++)
        {
            for(int j = 0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        Diagonalsum obj = new Diagonalsum();
        obj.display(n);
    }
}
