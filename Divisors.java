/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]); //Get the number from the user
		for(int i = 1; i <= num; i++){
			if (num % i ==0) { //checks if the current i is a divisor of num
				System.out.println(i);
			}
		}
	}
}
	