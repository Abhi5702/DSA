public class Node 2{
    int data; // value
    Node next; // address of next node

    public Node(int data) {
        this.data = data;
    }

    // Method to count the number of nodes in the linked list
    public static int countNodes(Node head) {
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public static void main(String[] args) {
        // Your existing code to create a linked list
        Node a = new Node(5);
        Node b = new Node(9);
        Node c = new Node(58);
        Node d = new Node(57);
        Node e = new Node(16);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Count the number of nodes
        int numberOfNodes = countNodes(a);
        System.out.println("Number of nodes in the linked list: " + numberOfNodes);
    }
}
