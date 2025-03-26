import java.util.Scanner;

class Descendingarray {

    public int Sorting(int arr[],int n)
    {

        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n-i-1;j++)
            {
                if(arr[j] < arr[j+1])
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
        return 0;
    }
    public int display() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter Array Elements : ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        return Sorting(arr,n);
    }
}

public class Descending {
    public static void main(String[] args) {
        Descendingarray obj = new Descendingarray();
        obj.display();
    }
}
