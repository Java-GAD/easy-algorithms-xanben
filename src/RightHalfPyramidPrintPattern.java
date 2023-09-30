public class RightHalfPyramidPrintPattern {

	public static void printRightHalfPyramid(int n){

		int numberToPrint = 0;

		for(int i = 0; i < n; i++){
			for(int j = 0; j <= i; j++){
				numberToPrint++;
				System.out.print(numberToPrint + " ");
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		printRightHalfPyramid(5);
	}


}
