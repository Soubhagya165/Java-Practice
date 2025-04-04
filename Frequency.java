import java.util.Scanner;

class FrequencyArray{
    void display() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int visited[] = new int[n];
        System.out.print("Enter Array Elements : ");

        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            visited[i] = 0;
        }

        for(int i = 0;i<n;i++)
        {

            if(visited[i] == 1)
            {
                continue;
            }
            int count = 1;

            for(int j = i+1;j<n;j++)
            {
                if(arr[i] == arr[j])
                {
                    visited[j] = 1;
                    count++;
                }
            }

            System.out.println(arr[i] +" comes "+count+" times");
        }


    }
}

public class Frequency {
    public static void main(String[] args) {
        FrequencyArray obj = new FrequencyArray();
        obj.display();
    }
}
