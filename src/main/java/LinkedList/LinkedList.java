package LinkedList;

public class LinkedList {
	Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void deleteGreaterThan(int key) {
        while (head != null && head.data > key) {
            head = head.next;
        }

        Node current = head;
        while (current != null && current.next != null) {
            if (current.next.data > key) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
}
