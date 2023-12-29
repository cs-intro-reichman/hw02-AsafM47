/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int Rep = Integer.parseInt(args[0]);
		int sim_count = 0; 

		boolean IsABoy = false;
		boolean IsAGirl = false;
		double Birth = Math.random();
		int child_count = 0;
		double Allchildren = 0;
		double Avarage = 0.0;

		int fam2_count = 0;
		int fam3_count = 0;
		int fam4_count = 0;

		while(sim_count < Rep)
		{
			IsABoy = false;
			IsAGirl = false;
			child_count = 0;
			while (IsABoy == false || IsAGirl == false) {
				child_count +=1;
				Allchildren +=1;
				if(Birth <= 0.4){
					IsAGirl = true;
				}
				else{
					IsABoy = true;
				}
				Birth = Math.random();
			}
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
		Avarage = (double)(Allchildren/Rep);
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
