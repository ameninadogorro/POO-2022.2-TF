package principall;
import java.util.Scanner;

public class questao1 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("------- Ímpar ou par -------");
		System.out.println("\nDigite um número: ");
		int num = input.nextInt();
		if (num % 2 == 0) {
			System.out.println("O número " + num + " é par");	
		}
		else {
			System.out.println("O " + num + " é ímpar");
		}
		System.out.println("----------------------------");
	}


}
