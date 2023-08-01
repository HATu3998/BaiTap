package stack;

public class StackTest {
StackNode root;
static class StackNode{
	int data;
	StackNode next;
	StackNode(int data){this.data=data;}
}
public boolean isEmpty() {
	if(root==null) {return true;}
	else {
		return false;
	}
}
	public void push(int data) {
		StackNode newNode=new StackNode(data);
		if(root==null) {
			root=newNode;
		}else {
			StackNode temp=root;
			root=newNode;
			newNode.next=temp;
		}
		System.out.println(data + " pushed to stack");
	}
	public int pop(){
		int poped=Integer.MIN_VALUE;
		if(root==null) {
			System.out.println("Stack is Empty");
		}
		else {
			poped=root.data;
			root=root.next;
		}
		return poped;
	}
	public int peek()
	{
		if (root == null) {
			System.out.println("Stack is empty");
			return Integer.MIN_VALUE;
		}
		else {
			return root.data;
		}
	}
}
