public class ParaStackNoLimit<E extends Object> {
	int stackSize;
	int top;
	E[] stack;
	
	ParaStackNoLimit(int i) {
		this.stackSize = i;
		this.top = -1;
		this.stack = (E[])new Object[stackSize];
	}
	
	public void push(E value) {
		if (stackSize >= stack.length) {
			E[] temp = (E[])new Object[stack.length * 2];
			System.arraycopy(stack, 0, temp, 0, stack.length);
			stack = temp;
			}
		stack[stackSize++] = value;
	}
}
