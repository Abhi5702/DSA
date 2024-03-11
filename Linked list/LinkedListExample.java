// LinkedListExample.java

public class Node {
    int data; // value
    Node next; // address of next node

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Inserting nodes at the beginning
        linkedList.insertAtBeginning(16);
        linkedList.insertAtBeginning(57);
        linkedList.insertAtBeginning(58);
        linkedList.insertAtBeginning(9);
        linkedList.insertAtBeginning(5);

        // Displaying the linked list
        linkedList.display();
    }
}

