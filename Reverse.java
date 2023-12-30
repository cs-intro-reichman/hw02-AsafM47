/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String input = args[0]; //Set input to be the word the user chose
		int n = input.length();
		for(int i = n; i>0; i--){
			System.out.print(input.charAt(i-1)); //Prints the input in reversed order
		}
		System.out.println("");
		n = n/2; //Set N to be the middle value of the string. 
		if(input.length() % 2 == 0){ // in case that the string is even n/2 will give us the middle char + 1. because we count fom 0.
			n = n-1; // adjust the value of n to be in the right place. 		
			System.out.println("The middle character is " + input.charAt(n));
		}
		else{
			System.out.println("The middle character is " + input.charAt(n));
		}


	}
}
