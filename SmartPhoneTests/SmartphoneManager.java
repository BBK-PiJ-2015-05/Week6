/**
* Week 6 Day 12
* Polymorphism
* 2. Upcasting, Downcasting
* Sarah Connor
*/

public class SmartphoneManager{
	
	public static void main(String[] args){
	SmartphoneManager myManager = new SmartphoneManager();
	
	/**
	* 2.2 Direct upcasting
	* will cause error because myPhone has been downcasted to a MobilePhone
	* which does not contain the methods called in Smartphone
	*/
	MobilePhone myPhone = new Smartphone("Nokia");
	myPhone.call("Mom");
	//myPhone.browseWeb("Reddit");
	//System.out.println(myPhone.findPosition());
	myManager.testPhone(myPhone);
	
	/**
	* 2.5 Casting exception
	* sending a MobilePhone to testPhone will throw a casting error
	* cannot downcast a class into something that it is not
	*/
	MobilePhone olderPhone = new MobilePhone("BlackBerry");
	myManager.testPhone(olderPhone);
	}
	/**
	* 2.3 Indirect Upcasting when Calling a Method
	* can call methods that exist in Phone class
	* it will use the Smartphone method overrides if it is a Smartphone
	*
	* 2.4 Downcasting
	* if phone is downcast to a Smartphone it has access to the Smartphone methods
	*/
	public void testPhone(Phone phone){
		Smartphone newPhone = (Smartphone) phone;
		newPhone.call("0079797979");
		newPhone.playGame("FTL");
		newPhone.browseWeb("bleh");
		System.out.println(newPhone.getBrand());
	}
	
}