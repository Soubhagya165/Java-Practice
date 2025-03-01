public class Newnode {

    public static void display(Node head){
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(8);
        Node d = new Node(12);
        Node e = new Node(23);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);
        display(a);
        
        
    }
}
