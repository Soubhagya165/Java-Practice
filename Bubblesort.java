import java.util.Scanner;

class Sorting{
    public void display(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.print("Enter Array Elements : ");

        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<n-1;i++)
        {
            for(int j = 0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

public class Bubblesort {

    public static void main(String[] args) {
        Sorting obj = new Sorting();
        obj.display();
    }
}
