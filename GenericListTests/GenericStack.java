/*
* Week 6 Day 12
* Polymorphism
* 5. Generic Stack
* Sarah Connor
*/

public class GenericStack<T extends Number> extends GenericList{

	private GenericObj<T extends Number> node;

	//constructor
	public CallStack(){
		this.node = null;
	}

	public void push(T obj){
		GenericObj<T extends Number> newNode = new GenericObj<T extends Number>(obj);
		if(node.getNext() != null){
			node.getNext() = newNode;
		}else{
			this.node.addNode(num);
		}

	}

	public void pop(){
		System.out.print("Popping... ");
		if(this.node == null){
			//do nothing
		}else if(this.node.getNext() == null){
			System.out.println("it's a " + this.node.getInt());
			this.node = null;
		}else{
			this.node.removeNode();
		}
	}

	public boolean empty(){
		if(this.node == null){
			System.out.println("Stack is empty.");
			return true;
		}else{
			System.out.println("The stack is not empty.");
			return false;
		}
	}
}