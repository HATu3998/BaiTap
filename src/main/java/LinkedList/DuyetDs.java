package LinkedList;
import java.util.Scanner;
public class DuyetDs {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập số nguyên dương n: ");
	        int n = scanner.nextInt();

	        Node head = null;
	        Node tail = null;

	        System.out.println("Nhập " + n + " số nguyên của dãy số:");

	        for (int i = 0; i < n; i++) {
	            int num = scanner.nextInt();
	            Node newNode = new Node(num);

	            if (head == null) {
	                head = newNode;
	                tail = newNode;
	            } else {
	                tail.next = newNode;
	                tail = newNode;
	            }
	        }

	        System.out.print("Nhập số nguyên k (0 ≤ k < n): ");
	        int k = scanner.nextInt();

	        scanner.close();

	        int result = getElementAtIndex(head, k);

	        System.out.println("Giá trị phần tử ở chỉ số " + k + " là: " + result);
	    }

	    public static int getElementAtIndex(Node head, int index) {
	        int count = 0;
	        Node current = head;

	        while (current != null) {
	            if (count == index) {
	                return current.data;
	            }
	            count++;
	            current = current.next;
	        }

	        // Trường hợp index không hợp lệ
	        return -1;
	    }
}
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
