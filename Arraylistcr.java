import java.util.Scanner;
import java.util.ArrayList;

public class Arraylistcr {
    void display() {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> arr = new ArrayList<>(5);

        System.out.print("Enter Array Elements : ");

        for(int i = 0;i<5;i++)
        {
            arr.add(sc.nextInt());
        }

        System.out.print("Array elements are shown : ");
        for(int i = 0;i<5;i++)
        {
            System.out.print(arr.get(i)+" ");
        }
        sc.close();

        
    }
    public static void main(String[] args) {
        Arraylistcr obj = new Arraylistcr();
        obj.display();
    }
}
