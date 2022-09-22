package ch12;

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len=arrayStack.size();
		if(len==0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		return(arrayStack.remove(len-1));
	}
}

public class StackTest {
	public static void main(String[] args) {
		MyStack Stack = new MyStack();
		Stack.push("A");
		Stack.push("B");
		Stack.push("C");
		
		System.out.println(Stack.pop());
		System.out.println(Stack.pop());
		System.out.println(Stack.pop());
	}

}
