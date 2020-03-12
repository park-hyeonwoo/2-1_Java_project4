public class StackTest {
	public static void main(String[] args) {
		
		GenericStack stack1 = new GenericStack(5);
		
		System.out.println(stack1.isEmpty());
		stack1.push("apple");
		stack1.push(1.0);
		System.out.println(stack1.isEmpty());
		stack1.push(2);
		stack1.push("4");
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		
		ParaStack<String> stack2 = new ParaStack<String>(5);
		
		stack2.push("hi");
		stack2.push("hello");
		stack2.push("good");
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
		stack2.push("xyz");
		stack2.push("100");
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
		System.out.println(stack2.isEmpty());
		
		ParaStackNoLimit<String> stack3 = new ParaStackNoLimit<String>(5);
		stack3.push("A");
		stack3.push("B");
		stack3.push("C");
		stack3.push("D");
		stack3.push("E");
		stack3.push("F");
		stack3.push("G");
	}
}
