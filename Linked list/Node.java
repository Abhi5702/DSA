/* public class basic{

    public static class node{

  int data; // value
    node next;// address of next node

    node (int data){
        this.data=data;
    }

}
public static void main(String []args){

    node a = new node(5);
    node b = new node(9);
    node c = new node(58);
    node d = new node(57);
    node e = new node(16);

    a.next=b;
    b.next=c;
    c.next=d;
    d.next=e;

    System.out.print(a.data + " ");
    System.out.print(b.data+ " ");
    System.out.print(c.data);
    System.out.print(d.data);
    System.out.print(e.data);
}
}
*/
public class Node {

    int data; // value
    Node next; // address of next node

    Node(int data) {
        this.data = data;
    }

    public static void main(String[] args) {

        Node a = new Node(5);  // creation of nodes 
        Node b = new Node(9);
        Node c = new Node(58);
        Node d = new Node(57);
        Node e = new Node(16);

        a.next = b;   // connection of nodes 
        b.next = c;
        c.next = d;
        d.next = e;

        Node temp = a;

        while (temp != null) {     // printing LL
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
