import java.util.Scanner;
public class Rotator {
	
	/**
	 * Function that returns an array
	 * @param int[] args - The array to be rotated
	 * @param int rotation - number of rotations
	 * @return array
	 * */
	public static int[] rotate(int args[], int rotation){

		int last;
		for(int i = 0; i < rotation; i++){
			last = args[args.length - 1];
				for(int j = args.length-2; j >= 0; j--){
					args[j+1] = args[j];
				}
				args[0] = last;
		}
		return args;
	}
	
	/**
	 * Demonstration for the program
	 * 
	 * */
		public static void main(String[]args){
			
			Scanner input = new Scanner(System.in);
			System.out.print("Enter Rotations: ");
			
			int rotations = input.nextInt();   //get user input for number of rotations
			int[]nums = {1,2,3,4,5,6,7,8,9,0};
						
			for(int i : rotate(nums, rotations)){ //Display results after rotation
				System.out.println(i);
			}	
		}
}
