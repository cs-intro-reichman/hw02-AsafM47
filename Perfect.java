/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		String perfect =  num + " is a perfect number since " + num + " = ";
		int count = 0; // count will sum up the divisiors 

		for(int i = 1; i <num; i++){
			if (num % i ==0) { //checks if the current i is a divisor of num
				count += i;
				perfect += i + " + ";
			}
		}
		if(count == num){
			String new_perfect = perfect.substring(0, perfect.length()-3); //new string output without the " + " at the end. 
			System.out.println(new_perfect);
		}
		else{
			System.out.println(num + " is not a perfect number");
		}

	}
}
