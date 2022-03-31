import java.util.Scanner;

public class DecisionMaking {

	public static void main(String[] args) {

		System.out.println("Welcome! What is your name");
		Scanner scannerObj = new Scanner(System.in);
		String userName = scannerObj.nextLine();

		System.out.println(userName + ", please enter a number between 1 an 100");

		int userInput = scannerObj.nextInt();

		if (!(userInput > 0) || !(userInput <= 100)) {
			System.out.println(userName + ", that is an invalid input");
			scannerObj.close();
			return;
		}

		boolean isUserInputEven = isEven(userInput);

		if (!isUserInputEven) {
			System.out.println(userInput + " and Odd. Thanks " + userName);
		}

		if (isUserInputEven && userInput >= 2 && userInput <= 25) {

			System.out.println("Even and less than 25.");
		}

		if (isUserInputEven && userInput >= 26 && userInput <= 60) {
			System.out.println("Even.");

		}

		if (isUserInputEven && userInput > 60) {
			System.out.println(userInput + " and Even");
		}

		if (!isUserInputEven && userInput > 60) {
			System.out.println(userInput + " and Odd and over 60");

		}

		scannerObj.close();

	}

	public static boolean isEven(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
