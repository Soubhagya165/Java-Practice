import java.util.Scanner;

class Deleting{
    Scanner sc = new Scanner(System.in);
    void display() {
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter Array Elements : ");

        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        int position;
        System.out.print("Enter position to delete : ");
        position = sc.nextInt();

        for(int i = position;i<n-1;i++)
        {
            arr[i] = arr[i+1];
        }

        for(int i = 0;i<n-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

public class Deletion3 {
    public static void main(String[] args) {
        Deleting obj = new Deleting();
        obj.display();
    }
}
