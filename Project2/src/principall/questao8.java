package principall;
import java.util.Scanner;

public class questao8 {
	public static void main(String[] args) {
		int j = 0;
		do {
			System.out.println("--------------------MENU DE OPÇÕES------------------------");
			System.out.println("1- Imposto");
			System.out.println("2- Novo salário");
			System.out.println("3- Classificação");
			System.out.println("4- Finalizar o programa.");
			System.out.print("Digite a opção desejada: ");
			Scanner sc = new Scanner(System.in);
			int opçao = sc.nextInt();
			System.out.println("----------------------------------------------------------------------");
			if(opçao > 4 || opçao < 1) {
				System.out.println("Opção inválida!");

			}
			if (opçao == 1) {
				System.out.println("IMPOSTO");
				System.out.print("Digite o valor do seu salário:");
				double salario = sc.nextDouble();
				if(salario < 500.00) {
					double imposto = salario * 5/100;
					System.out.println("O imposto corresponde a " + imposto);

				}
				else if(salario >= 500.00 && salario<= 850.00 ) {
					double imposto = salario * 10/100;
					System.out.println("O imposto corresponde a " + imposto);
				}
				else {
					double imposto = salario * 15/100;
					System.out.println("O imposto corresponde a " + imposto);
				}


			}
			if(opçao==2) {
				System.out.println("NOVO SALÁRIO");
				System.out.print("Digite o valor do seu salário:");
				double salario = sc.nextDouble();
				if(salario > 1500.00) {
					double novoSalario = salario + 25.00;
					System.out.println("O novo salário é " + novoSalario);
				}
				if(salario >= 750.00 && salario <= 1500.00) {
					double novoSalario = salario + 50.00;
					System.out.println("O novo salário é " + novoSalario);
				}
				if(salario >= 450.00 && salario < 750.00) {
					double novoSalario = salario + 75.00;
					System.out.println("O novo salário é " + novoSalario);
				}
				if(salario < 450.00) {
					double novoSalario = salario + 100.00;
					System.out.println("O novo salário é " + novoSalario);
				}
			}
			if(opçao == 3) {
				System.out.println("CLASSIFICAÇÃO");
				System.out.print("Digite o valor do seu salário:");
				double salario = sc.nextDouble();
				if(salario <= 700.00) {
					System.out.println("Mal Remunerado!");

				}
				else {
					System.out.println("Bem Remunerado!");
				}

			}
			if(opçao == 4) {
				System.out.println("Programa finalizado!");
			}
			System.out.print("\nDigite 0 se você quer continuar: ");
			j = sc.nextInt();
			System.out.println(" ");
		}
		while(j==0);


	}
}
