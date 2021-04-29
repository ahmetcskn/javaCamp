package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Excellent : You passed.");
			break;
		case 'B':
			System.out.println("Very good : You passed.");
			break;
		case 'C':
			System.out.println("Bad : You didn't pass.");
			break;
		default:
			System.out.println("Invalid note!");

		}

	}

}
