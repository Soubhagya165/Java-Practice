import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[]= new String[5];
        System.out.print("Enter array elements : ");
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.next();
        }
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}
