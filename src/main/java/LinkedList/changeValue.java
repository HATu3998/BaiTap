package LinkedList;
import java.util.Scanner;
import LinkedList.LNode;
public class changeValue {
	  public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int n = input.nextInt();

	        LNode head = null;
	        LNode tail = null;

	        for (int i = 0; i < n; i++) {
	            int num = input.nextInt();
	            LNode newNode = new LNode(num);

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
	  
	  public void dele(LNode head,int index) {
		
		  if(index==0) {
			  head=head.next;
		  }else {
			  LNode current=head;
			for(int i=0;i<index-1;i++) {
				current=current.next;
			}
			current.next=current.next.next;
		  }
		  
	  }

	    public static void changeValue(LNode head, int a, int b) {
	        LNode current = head;
	        while (current != null) {
	            if (current.val == a) {
	                current.val = b;
	            }
	            current = current.next;
	        }
	    }

	    public static void printLinkedList(LNode head) {
	        LNode current = head;
	        while (current != null) {
	            System.out.print(current.val + " ");
	            current = current.next;
	        }
	    }
	

	}