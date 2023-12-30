/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int Rep = Integer.parseInt(args[0]);
		int sim_count = 0; //This variable will count how many times we did the test  

		boolean IsABoy = false; //This variable will become true when a boy is born.
		boolean IsAGirl = false; //This variable will become true when a girl is born.
		double Birth = Math.random(); //This variable holds the results of the birth.
		int child_count = 0; //This variable counts how many children were born inside the current simulation. 
		double Allchildren = 0; //This variable counts how many children were totally born. 
		double Avarage = 0.0;


		//variables that count the amount of families with 2, 3 ,4/more childrens 
		int fam2_count = 0;
		int fam3_count = 0;
		int fam4_count = 0;

		while(sim_count < Rep)
		{
			IsABoy = false;
			IsAGirl = false; // restes the 3 Variabeles in the start of each simulation
			child_count = 0;
			while (IsABoy == false || IsAGirl == false) {
				child_count +=1;
				Allchildren +=1;
				if(Birth <= 0.5){ //checks if a boy or a girl was born.
					IsAGirl = true;
				}
				else{
					IsABoy = true;
				}
				Birth = Math.random();
			}
			//checks how many children were in the family and updates the counters.
			if (child_count == 2) {
				fam2_count += 1;
			}
			else if (child_count ==3) {
				fam3_count +=1;
			}
			else{
				fam4_count +=1;
			}

			sim_count +=1;
		}
		Avarage = (double)(Allchildren/Rep); //Average of how many children were born untill each family had a b oy and a girl. 
		System.out.println("Avarge: " + Avarage + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + fam2_count);
		System.out.println("Number of families with 3 children: " + fam3_count);
		System.out.println("Number of families with 4 or more children: " + fam4_count);
		if(fam2_count > fam3_count && fam2_count > fam4_count) {
			System.out.println("The most common number of children is 2.");
		}
		else if (fam3_count > fam2_count && fam3_count > fam4_count) {
			System.out.println("The most common number of children is 3.");
		}
		else{
			System.out.println("The most common number of children is 4 or more.");
		}
	}
}
