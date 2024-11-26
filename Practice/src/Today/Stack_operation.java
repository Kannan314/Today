package Today;
public class Stack_operation {
	int[] stack;
	int size;
	int top;
	Stack_operation(int size){
		this.size=size;
		stack = new int[size];
		top=-1;
	}
	public void push(int val) {
		if(top==size-1)
			System.out.println("Stack overflow");
		else
			stack[++top]=val;
	}
	public int pop() {
		if(top==-1) {
			System.out.println("Stack underflow");
			return -1;
		}
		else
			return stack[top--];
	}
	public void peek() {
		if(top==-1)
			System.out.println("Stack underflow");
		else
			System.out.println(stack[top]);
	}
	public void update(int pos,int val) {
		if(top==-1)
			System.out.println("Stack underflow");
		if(pos>size || pos<0 || pos>top)
			System.out.println("Unable to insert");
		if(pos<top) {
			stack[pos]=val;
			System.out.println("Element updated");
		} 
	}
	public void display() {
		if(top==-1)
			System.out.println("Stack underflow");
		else {
			for(int i=0;i<=top;i++) {
				System.out.print(stack[i]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n = 8;
		Stack_operation s = new Stack_operation(n);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.display();
		System.out.print("Deleted element"+s.pop()+"\n");
		s.display();
		s.peek();
		s.update(2, 7);
		s.display();
	}
}