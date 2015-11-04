/*
* Week 6 Day 12
* Polymorphism
* 3 Generic List
* Sarah Connor
*/

public class Company{
	private GenericList<String> employees;
	private GenericList<Integer> NIN;
	
	public Company(){
		employees = new GenericList<String>();
		NIN = new GenericList<Integer>();
	}
	
	//getters
	public GenericList<String> getEmployees(){
		return employees;
	}
	
	public GenericList<Integer> getNIN(){
		return NIN;
	}
	
	public void add(String employee){
		employees.add(employee);
	}
	
	public void add(Integer nin){
		NIN.add(nin);
	}
	
	public void remove(String employee){
		employees.remove(employee);
	}
	
	public void remove(Integer nin){
		NIN.remove(nin);
	}
	
	public String toString(){
		return employees.toString() + " " + NIN.toString();
	}
	
}