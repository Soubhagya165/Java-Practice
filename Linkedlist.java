

public class Linkedlist {

    public static class Node{

        int data; //value
        Node next; //address of next node
        Node(int data){
            this.data = data;

        }
    }
    public static void main(String[] args) {
        // System.out.println(a.next); null
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(25); 
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(d.next.data);
        // System.out.println(a.next);   //Linkedlist$Node@2f92e0f4  
    }
}
