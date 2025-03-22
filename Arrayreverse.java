import java.util.Scanner;

class Reversearray {
    int[] arr = new int[5];


    void display() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the Array : ");
        int n = sc.nextInt();
        System.out.print("Enter Array Elements : ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("The Array is : ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int temp;
        int start = 0;
        int end = n-1;

        while(start<=end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.print("After Reversing the Array : ");
        for(int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}

public class Arrayreverse {
    public static void main(String[] args) {
        Reversearray obj = new Reversearray();
        obj.display();
    }
}
