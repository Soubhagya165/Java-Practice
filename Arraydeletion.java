import java.util.Scanner;
class Deletion{

    void display1(int arr[],int n)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position to delete : ");
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

    void display() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the Array : ");
        int n = sc.nextInt();

        int arr[] = new int[100];
        System.out.print("Enter array Elements : ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Displaying Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        display1(arr,n);
        sc.close();
    }
}

public class Arraydeletion {
    public static void main(String[] args) {
        Deletion obj = new Deletion();
        obj.display();
    }
}
