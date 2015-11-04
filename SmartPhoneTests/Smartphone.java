/**
* PiJ Birkbeck 2015-2016
* Week 5 Day 10
* Exercise 1 Extension, extension...
* SmartPhone extends MobilePhone
* browses internet, calls over internet and uses GPS
*/

public class Smartphone extends MobilePhone{

	public Smartphone(String brand){
		super(brand);
	}
	
	/**
	* overrides MobilePhone call method
	* @param number 
	* calls over the internet if detects it's an international call
	*/
	@Override
	public void call(String number){
		if(number.charAt(0) == '0' && number.charAt(1) == '0'){
			super.updateCallList(number);
			System.out.printf("Calling %s through the internet to save money\n", number);
		}else{
			super.call(number);
		}		
	}
	
	/**
	* @param site and prints the "Browsing the site: "
	*/
	public void browseWeb(String site){
		System.out.printf("Browsing the site: %s...\n", site);
	}
	
	/**
	* @return an arbitrary GPS position
	*/
	public String findPosition(){
		return "40.7127837, -74.00594130000002";
	}
}