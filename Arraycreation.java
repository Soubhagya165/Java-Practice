import java.util.Scanner;

class Array {

    int Arrayprint(int arr[]) {
        System.out.println("Printing Array Elements : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        return 0;
    }

    int display() {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return Arrayprint(arr);
    }
}

public class Arraycreation {
    public static void main(String[] args) {
        Array obj = new Array();
        obj.display();
    }
}