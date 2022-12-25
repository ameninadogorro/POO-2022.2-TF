package principall;
import java.util.Scanner;

public class questao10 {
	public static void main(String[] args) {
		int input, a, b;
		Scanner inp = new Scanner(System.in);

		System.out.println("------------------");
		System.out.println("  Tabuada online  ");
		System.out.println("------------------");
		input = inp.hashCode();
		System.out.println("------------------");
		for (a = 1; a <= 10; a++) {
			for (b = 1; b <= 10; b++) {
				System.out.println(a + " X " + b + " = " + a*b);
			}
			System.out.println("------------------");
		}
	}

}
