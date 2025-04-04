import java.util.Scanner;

class Insert{

    void display1(int arr[],int n)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Element to Insert : ");
        int element = sc .nextInt();
        System.out.print("Enter Position to insert : ");
        int position = sc.nextInt();

        for(int i = n;i>position;i--)
        {
            arr[i] = arr[i-1];
        }

        arr[position] = element;

        System.out.print("Displaying Array : ");
        for(int i = 0;i<n+1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    void display() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements : ");
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
    display1(arr,n);
    }
}

public class Elementinsert {
    public static void main(String[] args) {
        Insert obj = new Insert();
        obj.display();
    }
}
