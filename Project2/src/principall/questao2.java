package principall;
import java.util.Scanner;

public class questao2 {
	public static void main(String[] args) {
		float num1, num2, soma;
		int cont;
		do {
			System.out.println("-----------------------------------------");
			System.out.println("          |MENU| ");
			System.out.println("============================");
			System.out.println("[1] Somar dois números      ");
			System.out.println("[2] Raiz quadrada do número ");
			System.out.println("============================");
			Scanner inp = new Scanner(System.in);
			System.out.println("Digite a opção desejada: ");
			int opnum = inp.nextInt();
			if (opnum == 1) {
				System.out.println("Digite o primeiro número: ");
				num1 = inp.nextFloat();
				System.out.println("Digite o segundo número: ");
				num2 = inp.nextFloat();
				soma = num1 + num2;
				System.out.println("A soma de " + num1 + " e " + num2 + " é " + soma);
			}
			else if(opnum == 2) {
				System.out.println("Digite o número desejado: ");
				num1 = inp.nextInt();
				int raiz = (int)Math.sqrt(num1);
				System.out.println("A raiz quadrada de " + num1 + " é " + raiz);
			}
			else if (opnum != 1 && opnum != 2) {
				System.out.println("ERROR!!");
			}
			System.out.println("-----------------------------------------");
			System.out.println("\n[1] Para continuar \n[2] Para finalizar");
			cont = inp.nextInt();
		}
		while(cont == 1);

	}
}