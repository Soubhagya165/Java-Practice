import java.util.Scanner;

class Oddarray{
    int sum = 0;
    void display() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]%2 != 0)
            {
                sum += arr[i];
            }
        }
        System.out.print("The Sum is : ");
        System.out.print(sum);
    }
}

public class Arraysum {
    public static void main(String[] args) {
        Oddarray obj = new Oddarray();
        obj.display();
    }
}
