package uniqueSum;

public class UniqueSum {

	public static void main(String[] args) {
		System.out.println(addUniqueNumbers(2, 4, 5));
	}

	public static int addUniqueNumbers(int numberOne, int numberTwo, int numberThree) {
		if (numberOne == numberTwo || numberOne == numberThree) {
			numberOne = 0;
		}
		if (numberTwo == numberThree) {
			numberTwo = 0;
		}
		return numberOne + numberTwo + numberThree;
	}

}
