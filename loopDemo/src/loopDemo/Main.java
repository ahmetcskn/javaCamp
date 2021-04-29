package loopDemo;

public class Main {

	public static void main(String[] args) {

		
		// For
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("The for loop is over." +"\n");
		System.out.println("----------------------------");
		
		// While
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("The while loop is over." +"\n");
		System.out.println("----------------------------");
		
		// Do-While
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j <= 10);
		
		System.out.println("The Do-While loop is over." +"\n");
		System.out.println("----------------------------");
	}

}
