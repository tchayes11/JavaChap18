package hayes_18;

import java.util.Scanner;

public class Exercise18_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string of characters: ");
		String value = input.nextLine();
		reverseDisplay(value);
		

	}
	public static void reverseDisplay(String value){
		if(value.length() ==0) //base case
			return;
	
			
				System.out.print(value.substring(value.length()-1));  //recursive call
				reverseDisplay(value.substring(0, value.length() -1));
		
	}
}
