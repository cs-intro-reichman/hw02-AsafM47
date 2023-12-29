/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String input = args[0]; //Set input to be the word the user chose
		int n = input.length();
		for(int i = n; i>0; i--){
			System.out.print(input.charAt(i-1));
		}
		System.out.println("");
		System.out.println(input.charAt(n/2));

	}
}
