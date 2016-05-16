import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("a:");
		int a = input.nextInt();
		System.out.print("b:");
		int b = input.nextInt();
		if (a / b < 0) {
			System.out.print("-");
		} else {
			System.out.print("+");
		}
		input.close();
	}
}


