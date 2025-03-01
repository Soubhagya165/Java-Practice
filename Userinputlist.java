import java.util.Scanner;

class Node{
    int data;
    Node next;

    void displayreverse(Node a)
    {
        if(a == null)
        {
            return;
        }
        displayreverse(a.next);
        System.out.print(a.data+" ");
    }
    
    void display(Node a)
    {
        Node temp = a;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }
}
public class Userinputlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
        Node d = new Node();
        Node e = new Node();

        a.data = sc.nextInt();
        b.data = sc.nextInt();
        c.data = sc.nextInt();
        d.data = sc.nextInt();
        e.data = sc.nextInt();

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        a.displayreverse(a);
        
    }
}


