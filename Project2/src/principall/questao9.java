package principall;
import java.util.Scanner;

public class questao9 {
	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		System.out.println("Quantos números você quer digitar: ");
		int quantidade = sc.nextInt();
		if(quantidade<3000) {
			int quantidadePar, quantidadeImpar;
			double soma, maiorNum, menorNum, mediaPares, somaPares, porcentagem, resto;
			double [] num = new double[quantidade];
			quantidadeImpar = 0;
			quantidadePar = 0;
			somaPares=0;
			soma = 0;
			maiorNum = Integer.MIN_VALUE;
			menorNum = Integer.MAX_VALUE;
			for(int i = 0;i < quantidade; i++) {
				System.out.println("Digite o " + (i+1) + "º número: ");
				num[i] =sc.nextDouble();
				soma = soma + num[i];
				resto = num[i]%2;
				if(num[i]> maiorNum) {
					maiorNum = num[i];
				}
				if(num[i]<menorNum) {
					menorNum = num[i];
				}
				if(resto == 0) {
					++quantidadePar;
					somaPares= somaPares+ num[i];

				}
				else {
					++quantidadeImpar;

				}
			}
			porcentagem = quantidadeImpar* 100/quantidade;
			mediaPares = somaPares/quantidadePar;
			System.out.println("A soma dos números digitados foi: " + soma);
			System.out.println("A quantidade de números digitados foi: " + quantidade);
			System.out.println("A média dos números digitados foi: " + soma/quantidade);
			System.out.println("O maior número digitado é: " + maiorNum);
			System.out.println("O menor número digitado é: " + menorNum);
			System.out.println("A média dos números pares é: " + mediaPares);
			System.out.println("A porcentagem dos números ímpares é: " + porcentagem);



		}
		else {
			System.out.println("ERRO!");
		}

	}

}
