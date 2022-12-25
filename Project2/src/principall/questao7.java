package principall;
import java.util.Scanner;

public class questao7 {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		double altura = 0, peso = 0, mediaAltura = 0, mediaIdade = 0, mediaIdadePeso = 0;
		double tot80 = 0, somaPeso = 0, quantAltura = 0;
		int qtde = 0, quantIdade = 0, idade;


		for(int contTime =1; contTime <=5; contTime++){	
			for (int contJogador = 1; contJogador<=11; contJogador++){ 
				System.out.println("1) Digite a idade do jogador " + "["+ contJogador + "] do time " + "["+ contTime + "]: ");
				idade = inp.nextInt();
				System.out.println("2) Digite o peso do jogador " + "["+ contJogador + "] do time " + "["+ contTime + "]: ");
				peso = inp.nextDouble();
				System.out.println("2) Digite a altura do jogador " + "["+ contJogador + "] do time " + "["+ contTime + "]: ");
				altura = inp.nextDouble();


				if(idade < 18 ){
					qtde++;
				}

				quantIdade = quantIdade + idade;
				mediaIdade = quantIdade/contJogador;

				quantAltura = quantAltura + altura;
				mediaAltura = quantAltura/contJogador;

				if(peso >80){
					tot80++; 
					somaPeso = somaPeso + peso; 
					mediaIdadePeso = somaPeso/tot80;
				}
			}
			System.out.println("\n>>> A média de jogadores com peso acima de 80: "+ 2.F%mediaIdadePeso);		
			System.out.println("\n>>> A média de idades dos jogadores: "+ mediaIdade);
			System.out.println("\n>>> A média de alturas dos jogadores: "+ 2.F%mediaAltura);		
			System.out.println("\n>>> A quantidade de jogadores do time com idade inferior a 18 anos é: "+ qtde);
		}
	}

}
