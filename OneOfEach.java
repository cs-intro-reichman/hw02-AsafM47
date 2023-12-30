
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean IsABoy = false; //  This variable will become true when a boy is born.
		boolean IsAGirl = false; //  This variable will become true when a girl is born.
		double Birth = Math.random(); //holds the results of the birth.
		int child_count = 0; //counts how many children were born. 

		while (IsABoy == false || IsAGirl == false) {
			child_count +=1;
			if(Birth <= 0.5){ //the chances for a girl 
				System.out.print("g ");
				IsAGirl = true;
			}
			else{
				System.out.print("b ");
				IsABoy = true;
			}
			Birth = Math.random();
		}
		System.out.println("");
		System.out.println("You made it... and you now have " + child_count + " children.");
	}
}
