 import java.util.Scanner; 
 import java.util.Random;
 
 /**
  * Name: Ana Luiza Fonseca Teixeira
  * Teacher: Mr. Hardman 
  * Final Assignment
  * Date Last Modified: 1/25/2017
  */

/**
 * @author a.fonsecateixei
 *
 */
 
public class SpecialScore {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in); 
		
		int [] myNumber = {3, 50, 49};
		
		int [] mySecondNumber = {20, 10, 34};
		
		int [] myThirdNumber = {13, 21, 30};
		
		int [] userNumber = new int [3];
		
		int [] secondUserNumber = new int [3];
		
		int [] thirdUserNumber = new int [3];
		
		int [] randomArray;
		
		int randomNumber;
		
		int [] secondRandomArray;
		
		int secondRandomNumber;
		
		int [] thirdRandomArray;
		
		int thirdRandomNumber;
		
		String userName;
		
		int maximum;
		
		int userMaximum;

		int secondArrayMaximum;
		
		int secondUserMaximum;
		
		int thirdArrayMaximum;
		
		int thirdUserMaximum;
		
		int thirdScoreSpecial;
		
		int secondScoreSpecial;
		
		int scoreSpecial;

		
		System.out.println("Hello user! What is your name? ");
		userName = userInput.next();
		
		System.out.println(userName + "," + " please enter nine positive integers! ");
			
		for(int i = 0; i < userNumber.length; i++){
			
			do {
				
				System.out.print("Please, enter an integer: ");
				userNumber[i] = userInput.nextInt();
					
				if( userNumber[i] < 1 ){
					
					System.out.println("Please, enter an integer greater than zero!");
					
				}
				
			} while(userNumber[i] < 1);
				
		}	
		
		randomNumber = getNewRandom();
		
		//Here I set randomArray equal to one of the three arrays I created 
		if(randomNumber == 0 ){
			
			randomArray = myNumber;
			
		}
		
		else if(randomNumber == 1){
			
			randomArray = mySecondNumber;
			
		}
		
		else {
			
			randomArray = myThirdNumber;
			
		}
		
		
		for(int i = 0; i < secondUserNumber.length; i++){
			
			do {
				
				System.out.print("Please, enter an integer: ");
				secondUserNumber[i] = userInput.nextInt();
					
				if( secondUserNumber[i] < 1 ){
					
					System.out.println("Please, enter an integer greater than zero!");
					
				}
				
			} while(secondUserNumber[i] < 1);
				
		}
		
		
		secondRandomNumber = getSecondNewRandom();
		
		//Here I set secondRandomArray equal to one of the three arrays I created 
		if(secondRandomNumber == 0 ){
			
			secondRandomArray = mySecondNumber;
			
		}
		
		else if(secondRandomNumber == 1){
			
			secondRandomArray = myThirdNumber;
			
		}
		
		else {
			
			secondRandomArray = myNumber;
			
		}
		
		for(int i = 0; i < thirdUserNumber.length; i++){
			
			do {
				
				System.out.print("Please, enter an integer: ");
				thirdUserNumber[i] = userInput.nextInt();
					
				if( thirdUserNumber[i] < 1 ){
					
					System.out.println("Please, enter an integer greater than zero!");
					
				}
				
			} while(thirdUserNumber[i] < 1);
				
		}
		
		thirdRandomNumber = getThirdNewRandom();
		
		//Here I set thirdRandomArray equal to one of the three arrays I created 
		if(thirdRandomNumber == 0 ){
			
			thirdRandomArray = myThirdNumber;
			
		}
		
		else if(thirdRandomNumber == 1){
			
			thirdRandomArray = myNumber;
			
		}
		
		else {
			
			thirdRandomArray = mySecondNumber;
			
		}	
		
		maximum = 0;
		
		//Here I find the highest multiple of 10 in my array
		for(int i = 0; i < randomArray.length; i++){
			
			if (randomArray[i] % 10 == 0){
				
				if(randomArray[i] > maximum){
					
					//if yes, change maximum to the current element
					maximum = randomArray[i];
				
				}
				
			}
			
		}
		
		userMaximum = 0;
		
		//Here I find the highest multiple of 10 in userNumber array
		for(int i = 0; i < userNumber.length; i++){
			
			if (userNumber[i] % 10 == 0){
				
				if(userNumber[i] > userMaximum){
					
					//if yes, change maximum to the current element
					userMaximum = userNumber[i];
				
				}
				
			}
			
		}
		
		scoreSpecial = maximum + userMaximum;
		
		secondArrayMaximum = 0;
		
		//Here I find the highest multiple of 10 in my second array
		for(int i = 0; i < secondRandomArray.length; i++){
			
			if (secondRandomArray[i] % 10 == 0){
				
				if(secondRandomArray[i] > secondArrayMaximum){
					
					//if yes, change maximum to the current element
					secondArrayMaximum = secondRandomArray[i];
				
				}
				
			}
			
		}
		
		secondUserMaximum = 0;
		
		//Here I find the highest multiple of 10 in the secondUserNumber array
		for(int i = 0; i < secondUserNumber.length; i++){
			
			if (secondUserNumber[i] % 10 == 0){
				
				if(secondUserNumber[i] > secondUserMaximum){
					
					//if yes, change maximum to the current element
					secondUserMaximum = secondUserNumber[i];
				
				}
				
			}
			
		}
		
		secondScoreSpecial = secondArrayMaximum + secondUserMaximum;
		
		thirdArrayMaximum = 0;
		
		//Here I find the highest multiple of 10 in my third array
		for(int i = 0; i < thirdRandomArray.length; i++){
			
			if (thirdRandomArray[i] % 10 == 0){
				
				if(thirdRandomArray[i] > thirdArrayMaximum){
					
					//if yes, change maximum to the current element
					thirdArrayMaximum = thirdRandomArray[i];
				
				}
				
			}
			
		}
		
		thirdUserMaximum = 0;
		
		//Here I find the highest multiple of 10 in thirdUserNumber array
		for(int i = 0; i < thirdUserNumber.length; i++){
			
			if (thirdUserNumber[i] % 10 == 0){
				
				if(thirdUserNumber[i] > thirdUserMaximum){
					
					//if yes, change maximum to the current element
					thirdUserMaximum = thirdUserNumber[i];
			
				}
				
			}
			
		}
		
		thirdScoreSpecial = thirdUserMaximum + thirdArrayMaximum;

		//From this point until the end of this class, I display
		//all the arrays and the results of the code above
		System.out.println("\n" + "The sum of the highest multiples of 10 of each array are: ");
		System.out.println();
		
		System.out.print("\nscoresSpecial:");
		
		for(int i = 0; i < randomArray.length; i++){
			
			if(i == 0){
				
				System.out.print(String.format("([%3d,", randomArray[i]) );
			
			} else if( i == randomArray.length - 1){
				
				System.out.print(String.format("%3d],", randomArray[i]) );
			
			} else {
				
				System.out.print(String.format("%3d,", randomArray[i]) );
			
			}
			
		}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
		
		for(int i = 0; i < userNumber.length; i++){
			
			if(i == 0){
				
				System.out.print(String.format("[%3d,", userNumber[i]) );
			
			} else if( i == userNumber.length - 1){
				
				System.out.print(String.format("%3d])", userNumber[i]) );
			
			} else {
				
				System.out.print(String.format("%3d,", userNumber[i]) );
			
			}
			
		}
		
		System.out.print(" = " + scoreSpecial);
		
		System.out.print("\nscoresSpecial:");
		
		for(int i = 0; i < secondRandomArray.length; i++){
			
			if(i == 0){
				
				System.out.print(String.format("([%3d,", secondRandomArray[i]) );
			
			} else if( i == secondRandomArray.length - 1){
				
				System.out.print(String.format("%3d],", secondRandomArray[i]) );
			
			} else {
				
				System.out.print(String.format("%3d,", secondRandomArray[i]) );
			
			}
			
		}
		
		for(int i = 0; i < secondUserNumber.length; i++){
			
			if(i == 0){
				
				System.out.print(String.format("[%3d,", secondUserNumber[i]) );
			
			} else if( i == secondUserNumber.length - 1){
				
				System.out.print(String.format("%3d])", secondUserNumber[i]) );
			
			} else {
				
				System.out.print(String.format("%3d,", secondUserNumber[i]) );
			}
			
			
		}
		
		System.out.print(" = " + secondScoreSpecial);
		
		System.out.print("\nscoresSpecial:");
		
		for(int i = 0; i < thirdRandomArray.length; i++){
			
			if(i == 0){
				
				System.out.print(String.format("([%3d,", thirdRandomArray[i]) );
			
			} else if( i == thirdRandomArray.length - 1){
				
				System.out.print(String.format("%3d],", thirdRandomArray[i]) );
			
			} else {
				
				System.out.print(String.format("%3d,", thirdRandomArray[i]) );
			}
			
			
		}
		
		for(int i = 0; i < thirdUserNumber.length; i++){
			
			if(i == 0){
				
				System.out.print(String.format("[%3d,", thirdUserNumber[i]) );
			
			} else if( i == thirdUserNumber.length - 1){
				
				System.out.print(String.format("%3d])", thirdUserNumber[i]) );
			
			} else {
				
				System.out.print(String.format("%3d,", thirdUserNumber[i]) );
			}
			
			
		}
		
		System.out.print(" = " + thirdScoreSpecial);
		
		userInput.close();
		
		//main class ends here
		
	}

	/**
	 * getNewRandom picks one of the three arrays created above 
	 * 
	 * @param There are no parameters.
	 * @return one of the three arrays the computer picked
	 */
	
	private static int getNewRandom(){
		
		Random picker = new Random();
		int random;
		
		random = picker.nextInt(3);
		
		return random;
		
	}
	
	/**
	 * getSecondNewRandom picks one of the three arrays created above 
	 * 
	 * @param There are no parameters.
	 * @return one of the three arrays the computer picked
	 */
	
	private static int getSecondNewRandom(){
		
		Random picker = new Random();
		int secondRandom;
		
		secondRandom = picker.nextInt(3);
		
		return secondRandom;
		
	}
	
	/**
	 * getThirdNewRandom picks one of the three arrays created above 
	 * 
	 * @param There are no parameters.
	 * @return one of the three arrays the computer picked
	 */
	
	private static int getThirdNewRandom(){
		
		Random picker = new Random();
		int thirdRandom;
		
		thirdRandom = picker.nextInt(3);
		
		return thirdRandom;
		
	}

}