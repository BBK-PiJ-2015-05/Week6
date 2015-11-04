/*
* Week 6 Day 12
* Polymorphism
* 3 Generic List
* Sarah Connor
*/

public class GenericObj<T>{
	private T object;
	private GenericObj<T> next;
	private GenericObj<T> prev;
	
	//constructors
	public GenericObj(){
		this.object= null;
		this.next = null;
		this.prev = null;
	}
	public GenericObj(T object){
		this.object= object;
		this.next = null;
		this.prev = null;
	}
	
	//setters
	public void setObject(T object){
		this.object = object;
	}
	public void setNext(GenericObj<T> next){
		this.next = next;
	}
	public void setPrev(GenericObj<T> prev){
		this.prev = prev;
	}
	//getters
	public T getObject(){
		return this.object;
	}
	public GenericObj<T> getNext(){
		return this.next;
	}
	public GenericObj<T> getPrev(){
		return this.prev;
	}
	
	public String toString(){
		return object.toString();
	}
}