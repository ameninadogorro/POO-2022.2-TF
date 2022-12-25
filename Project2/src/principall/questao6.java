package principall;
import java.util.Scanner;

public class questao6 {
	public static void main(String[] args) {
		int numero,divisores=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------");
		System.out.println("Veja se o número é primo");
		System.out.println("------------------------");


		System.out.println("Digite um numero:");
		numero = sc.nextInt();
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {

				divisores++;
			}

		}
		if(divisores==2) {
			System.out.println("O número " + numero + " é primo");
		} else {
			System.out.println("O número " + numero + " não é primo");
		}

	}

}
