/**
* PiJ Birkbeck 2015-2016
* Week 5 Day 10
* Exercise 1 Extension, extension...
* OldPhone implements Phone class
*/

public class OldPhone implements Phone{
	
	private String brand = null;
	
	public OldPhone(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	/**
	* @param number Just print on the screen: "Calling number...".
	*/
	public void call(String number){
	
		System.out.printf("Calling %s...\n", number);
	}
}