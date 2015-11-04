/**
* PiJ Birkbeck 2015-2016
* Week 5 Day 10
* Exercise 1 Extension, extension...
* MobilePhone extends OldPhone class
* Uses call(String) method
*/

public class MobilePhone extends OldPhone{
	private String[] phoneNums;
	private int numCalls;
	
	/**
	* @param brand constructor
	* creates an array of Strings to store the last 10 calls made
	*/
	public MobilePhone(String brand){
		super(brand);
		phoneNums = new String[10];
		for(int i = 0; i < 10; i++){
			phoneNums[i] = null;
		}
	}
	
	/**
	* extends the OldPhone call method
	* stores the latest @param number in the phoneNums array
	*/
	@Override
	public void call(String number){
		updateCallList(number);
		super.call(number);
	}
	
	/**
	* @param number
	* Updates the call list with number
	*/
	protected void updateCallList(String number){
		numCalls++;
		numCalls = numCalls % 10;
		phoneNums[numCalls] = number;
	}
	
	/**
	* @param alarm prints "Beep, beep "
	*/
	public void ringAlarm(String alarm){
		System.out.printf("Beep, beep %s\n", alarm);
	}
	
	/**
	*@param game
	* prints "Starting the game: "
	*/
	protected void playGame(String game){
		System.out.printf("Starting the game: %s...\n", game);
	}
	
	/**
	* prints the last ten phone numbers called
	*/
	public void printLastNumbers(){
		for(int i = 0; i < 10; i++){
			System.out.println(phoneNums[i]);
		}
	}
	
	
}