import java.util.Scanner;

class Deleteelement{

    void Show(int arr[],int n,Scanner sc)
    {
        System.out.print("Enter element to delete : ");
        int element = sc.nextInt();

        int position = -1;

        for(int i = 0;i<n;i++)
        {
            if(element == arr[i])
            {
                position = i;
                break;
            }
        }

        if(position == -1)
        {
            System.out.println("The Element is not Present in the Array ");
            return;
        }


        for(int i = position;i<n;i++)
        {
            arr[i] = arr[i+1];
        }

        System.out.print("Displaying Array After Delete : ");
        for(int i = 0;i<n-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    void display() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements present in the Array : ");
        int n = sc.nextInt();

        int arr[] = new int[100];
        System.out.print("Enter Array Elements : ");

        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Displaying Array : ");
        for(int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        Show(arr,n,sc);
        sc.close();
    }
}

public class deletion5 {
    public static void main(String[] args) {
        Deleteelement obj = new Deleteelement();
        obj.display();
    }
}
