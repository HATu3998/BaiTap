package LinkedList;
import java.util.Scanner;
 
public class changeValue {
	  public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int n = input.nextInt();

	        Node head = null;
	        Node tail = null;

	        for (int i = 0; i < n; i++) {
	            int num = input.nextInt();
	            Node newNode = new Node(num);

	            if (head == null) {
	                head = newNode;
	                tail = newNode;
	            } else {
	                tail.next = newNode;
	                tail = newNode;
	            }
	        }

	        int a = input.nextInt();
	        int b = input.nextInt();
	        input.close();

	        // Thay đổi giá trị của các phần tử có giá trị a thành giá trị b
	        changeValue(head, a, b);

	        // In ra màn hình danh sách sau khi thay đổi giá trị
	        printLinkedList(head);
	    }

	    public static void changeValue(Node head, int a, int b) {
	        Node current = head;
	        while (current != null) {
	            if (current.val == a) {
	                current.val = b;
	            }
	            current = current.next;
	        }
	    }

	    public static void printLinkedList(Node head) {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.val + " ");
	            current = current.next;
	        }
	    }
	}

	class Node {
	    int val;
	    Node next;

	    public Node(int val) {
	        this.val = val;
	        this.next = null;
	    }
	}