/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int current = (int)(Math.random()*10); //generates a number between 0 , 10 exclusive. 
		int new_num = current;

		while(new_num >= current){ // generates new number untill the nre number is lower then the current number
			System.out.print(new_num + "");
			current = new_num;
			new_num = (int)(Math.random()*10); 
		}
	}
}
