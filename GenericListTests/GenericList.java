/*
* Week 6 Day 12
* Polymorphism
* 3 Generic List
* Sarah Connor
*/

public class GenericList<T>{
	private GenericObj<T> head;
	
	//constructors
	public GenericList(){
		this.head = null;
	}
	public GenericList(GenericObj<T> head){
		this.head = head;
	}
	
	public void add(T newObj){
		GenericObj<T> newObject = new GenericObj<T>(newObj);
		if(head == null){
			head = newObject;
		}else if(head.getNext() == null){
				head.setNext(newObject);
				newObject.setPrev(head);
		}else{
			GenericList<T> curr = new GenericList<T>(head.getNext());
			curr.add(newObj);
		}
	}
	
	public void remove(T remObj){
		if(head.getPrev() == null && head.getObject().equals(remObj)){
			if(head.getNext() != null){
				head = head.getNext();
				head.setPrev(null);
			}else{
				head = null;
			}
		}else if(head.getNext().getObject().equals(remObj)){
			if(head.getNext().getNext() != null){
				head.getNext().getNext().setPrev(head);
				GenericObj<T> temp = new GenericObj<T>();
				temp = head.getNext().getNext();
				head.setNext(temp);
			}
		}else{
			head = head.getNext();
			remove(remObj);
		}
	}
	
	//print forwards through the list
	public String toString(){
		if(head == null){
			return "";
		}else if (head.getNext() != null) {
			return head.getNext().toString();
		}else{
			return head.toString();
		}
	}
	
}