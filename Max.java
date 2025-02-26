import java.util.Scanner;

class MaxElement{

    String name;
    void display(int n)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[n];
        int max = arr[0];

        System.out.print("Enter Array Elements : ");
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println("My name is "+name);
        System.out.print("The MAX value is : ");
        System.out.println(max);
    }
}

public class Max {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        MaxElement obj = new MaxElement();
        obj.name = "Soubhagya Kumar Mishra";
        obj.display(n);
    }
}
