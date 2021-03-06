import java.util.Scanner;

public class LabProgram_AdjustListByNormalizing {
	//Gets smallest integer in an integer array
	public static int getMinimumInt(int[] listInts, int listSize) {
		int min = listInts[0];
		for (int i = 1; i < listSize; i++) {
			if (listInts[i] < min) {
				min = listInts[i];
			}
		}
		return min;
	}
	
	//MAIN
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int size = scnr.nextInt();
		int[] input = new int[size];
		int min;
		
		//Gets input
		for (int i = 0; i < input.length; i++) {
			input[i] = scnr.nextInt(); 
		}
		scnr.close();
		
		//Gets smallest integer from input
		min = getMinimumInt(input, size);
		
		//Normalizes list by subtracting min from everything
		for (int i = 0; i < input.length; i++) {
			input[i] -= min; 
		}
		
		//Outputs array
		for (int i = 0; i < input.length; i++) {
			System.out.print("" + input[i]+ " ");
		}
		System.out.println();
	}
}