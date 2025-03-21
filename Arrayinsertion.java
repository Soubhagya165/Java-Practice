import java.util.Scanner;

class Insertany{
    Scanner sc = new Scanner(System.in);

    void display() {
        System.out.print("Enter Array Elements no : ");
        int n = sc.nextInt();

        int arr[] = new int[100];

        System.out.print("Enter Array Elements : ");

        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Element to Add : ");
        int element = sc.nextInt();
        System.out.print("Enter Position to add : ");
        int pos = sc.nextInt();


        for(int i = n;i>pos;i--)
        {
            arr[i] = arr[i-1];
        }

        arr[pos] = element;

        for(int i = 0;i<n+1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

public class Arrayinsertion {
    public static void main(String[] args) {
        Insertany obj = new Insertany();
        obj.display();
    }
}
