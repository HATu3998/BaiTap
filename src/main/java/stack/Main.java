package stack;

class Main {
	public static void main(String args[])
	{
		stack s = new stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s.pop() + " Popped from stack");
		System.out.println("Top element is :" + s.peek());
		System.out.print("Elements present in stack :");
		s.print();
		
		StackTest st = new StackTest();
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st.pop() + " Popped from stack");
		System.out.println("Top element is :" + st.peek());
		System.out.print("Elements present in stack :");
		while(!st.isEmpty())
	  {
		  System.out.print(" "+ st.pop());
	  }
	}
}
