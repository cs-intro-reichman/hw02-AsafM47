
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean IsABoy = false;
		boolean IsAGirl = false;
		double Birth = Math.random();
		int child_count = 0;
		while (IsABoy == false || IsAGirl == false) {
			child_count +=1;
			if(Birth <= 0.5){
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
