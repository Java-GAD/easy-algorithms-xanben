public class CountOnesInNumber {


	public static void main(String[] args) {

		int number = 25; // input number 00011001
		int count = 0;

		while(number != 0) {
			if((number & 1) == 1) {
				count++; // check if the last bit is 1
			}
			number >>= 1; // shift the number to check the next bit, so the last bit will be lost
		}

		System.out.println("Number of '1' bits in number[" + number + "] = [" + count + "]");
	}
}
