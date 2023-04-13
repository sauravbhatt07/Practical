package April13Stack;
import java.util.Stack;

public class StackEg {
	public static void main(String[] args) {
		// creating stack class
		Stack<Integer>s=new Stack<>();
		boolean result =s.isEmpty();
		System.out.println("Is the stack empty ?"+s);// result
		// adding elements (push)
		s.push(25);
		s.push(20);
		s.push(75);
		s.push(56);
		s.push(80);
		s.push(43);
		s.push(34);
		Integer digit =s.peek(); // access elements from the
		System.err.println("top element:"+digit);
		System.out.println("Stack element after peek:"+s);
		Integer digit2=s.pop();
		System.err.println("top element:"+digit2);
		System.out.println("Stack element after pop:"+s);
		int digit1=s.search(75);// search any elements 
		System.out.println("search element:"+digit1);
		int x=s.size();// find the size of the stack
		System.out.println("stack size:"+x);
		result=s.empty();
		System.out.println("is the stack emp?"+result);
	}

}