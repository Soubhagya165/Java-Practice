import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(1,56);
        list.set(0, 20);
        System.out.println(list.get(1));
        
        list.remove(2);
        System.out.println(list);

        System.out.println(list.size());

        for(int i = 0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        Collections.sort(list);
        System.out.println(list);
    }
}
