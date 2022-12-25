package principall;
import java.util.Scanner;

public class questao3 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("---------------");
		System.out.println(" Equação do 2º");
		System.out.println("---------------");
		System.out.println("Digite o valor de a:");
		double a = sc.nextFloat();
		System.out.println("Digite o valor de b:");
		double b = sc.nextFloat();
		System.out.println("Digite o valor de c:");
		double c = sc.nextFloat();
		if(a!=0) {
			double delta = ((b*b) - (4*a*c));
			if(delta >= 0) {
				double x1 = (-b + Math.sqrt(delta))/(2*a);
				double x2 =(-b - Math.sqrt(delta))/(2*a);
				System.out.println("O resultado de x1 é: " + x1);
				System.out.println("O resultado de x2 é: " + x2);
			}
			else {
				System.out.println("O valor de delta é inválido");
			}
		}
		else {
			System.out.println("Não é uma equação do segundo grau, pois o valor de 'A' é 0 ");
		}

	}

}
