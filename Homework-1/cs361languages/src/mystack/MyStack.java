/**
 * 
 */
package mystack;

/**
 * @author David Gonzalez 
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		T currentTopValue = theStack.val;
		theStack = theStack.next;
		return currentTopValue;
	}

	public void push(T v) {
		// TODO To complete
		MyNode<T> addedNode = new MyNode<T>(v, theStack);
		theStack = addedNode;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		MyStack<Integer> integerStack = new MyStack<Integer>();
		integerStack.push(1);
		integerStack.push(2);
		System.out.println(integerStack.pop());
		integerStack.push(5);
		
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
		
		MyStack<Person> people = new MyStack<Person>();
		Person personOne = new Person("David", "Gonzalez");
		Person personTwo = new Person("Christelle", "Scharff");
		people.push(personOne);
		people.push(personTwo);
	}

}
