import java.util.Scanner;

class Arraydel{
    Scanner sc = new Scanner(System.in);

    void display() {
        System.out.print("Enter no of elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter Array Elements : ");

        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Position to delete : ");
        int position = sc.nextInt();

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

public class Deletearray {
    public static void main(String[] args) {
        Arraydel obj = new Arraydel();
        obj.display();
    }
}
