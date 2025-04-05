import java.util.Scanner;

class Frequency {

    void Show(int arr[], int n, int visiting[]) {
        int count;
        for (int i = 0; i < n; i++) {
            count = 1;
            if (visiting[i] == 1) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                    visiting[j] = 1;
                }
            }
            System.out.println(arr[i] + " comes " + count + " times");
        }
    }

    void display() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the Array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int visiting[] = new int[n];
        System.out.print("Enter Elements of the Array : ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            visiting[i] = 0;
        }

        System.out.print("Displaying Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Show(arr, n, visiting);

    }

}

public class Frequency4 {
    public static void main(String[] args) {
        Frequency obj = new Frequency();
        obj.display();
    }
}
