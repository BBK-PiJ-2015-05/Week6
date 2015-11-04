/*
* Week 4 Day 7
* 3. Singly-linked lists
* Sarah Connor
*/

public class Patient{
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private Patient prevPatient;
	
	//constructors
	public Patient(){
		this.name= null;
		this.age = 0;
		this.illness = null;
		this.nextPatient = null;
		this.prevPatient = null;
	}
	public Patient(String name, int age, String illness){
		this.name= name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		this.prevPatient = null;
	}
	
	public void addPatient(Patient newPatient){
		if(this.name == null){
			this.name = newPatient.name;
			this.age = newPatient.age;
			this.illness = newPatient.illness;
		}
		if(this.nextPatient == null){
				this.nextPatient = newPatient;
				newPatient.prevPatient = this;
		}else{
			this.nextPatient.addPatient(newPatient);
		}
	}
	
	public boolean deletePatient(Patient patient){
		if(this.nextPatient == null){
			return false;
		}else if(this.prevPatient == null && this.name.equals(patient.name)){
			//still have to delete first patient from elsewhere
			//but ensures nothing is pointing backwards at the object
			nextPatient.prevPatient = null;
			return true;
		}else if(this.nextPatient.name.equals(patient.name)){
			nextPatient.nextPatient.prevPatient = this;
			this.nextPatient = nextPatient.nextPatient;
			return true;
		}else{
			return this.nextPatient.deletePatient(patient);
		}
	}
	
	//print forwards through the list
	public String toString(){
		String list = "";
		if (this.nextPatient != null) {
			list += this.name + "\t" + this.age + "\t" + this.illness + "\n";
			list += this.nextPatient.toString();
		}else if (this.name != null){
			list += this.name + "\t" + this.age + "\t" + this.illness + "\n";
			list+= "Total number of patients: " + this.countBackwards();
		}
		return list;
	}
	
	//print backwards through the list
	public void printBackwards(){
		if (this.prevPatient != null) {
			System.out.println(this.name + "\t" + this.age + "\t" + this.illness);
			this.prevPatient.printBackwards();
		}else{
			System.out.println(this.name + "\t" + this.age + "\t" + this.illness);
			System.out.println("Total number of patients: " + this.countPatients());
		}
	}
	
	public int countPatients(){
		int patientCount = 0;
		if(this.nextPatient != null){
			return patientCount += this.nextPatient.countPatients();
		}else if(this.name != null){
			return 1;
		}else{
			return 0;
		}
	}
	
	public int countBackwards(){
		int patientCount = 0;
		if(this.prevPatient != null){
			return patientCount += this.prevPatient.countBackwards();
		}else{
			return 1;
		}
	}
}