public class ParaStack<E> {
	int stackSize;
	int top;
	E[] stack;
	
	public ParaStack(int i) {
		this.stackSize = i;
		this.top = -1;
		this.stack = (E[])new Object[stackSize];
	}
	
	public boolean isEmpty() {
		if (this.top == -1)
			return true;
		else return false;
	}
	
	public void push(E value) {
		this.stack[++top] = value;
	}
	
	public E pop() {
		return this.stack[top--];
	}
}
