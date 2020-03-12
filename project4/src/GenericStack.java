public class GenericStack {
	int stackSize;
	int top;
	Object[] stack;
	
	public GenericStack(int i) {
		this.stackSize = i;
		this.top = -1;
		this.stack = new Object[stackSize];
	}
	
	public boolean isEmpty() {
		if (this.top == -1)
			return true;
		else return false;
	}
	
	public void push(Object value) {
		this.stack[++top] = value;
	}
	
	public Object pop() {
		return this.stack[top--];
	}
}