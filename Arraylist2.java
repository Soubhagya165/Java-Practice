import java.util.ArrayList;

public class Arraylist2 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(7);
        arr.add(10);
        arr.add(14);
        arr.add(76);
        System.out.println(arr.get(3));
        arr.set(1, 98);
        arr.remove(3);
        System.out.println(arr);

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        int sum = 0;

        for (int i = 0; i < arr.size(); i++) {
            sum = sum + arr.get(i);
        }
        System.out.println(sum);
    }
}
