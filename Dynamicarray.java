import java.util.ArrayList;
import java.util.Scanner;
public class Dynamicarray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<5;i++)
        {
            arr.add(sc.nextInt());
        }

        int sum = 0;

        for(int i = 0;i<5;i++)
        {
            sum += arr.get(i);
        }
        System.out.println("The sum is : "+sum);
    }
}
