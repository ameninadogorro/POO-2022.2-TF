package principall;
import java.util.Scanner;

public class questao5 {
	public static void main(String[] args) {
		   int n, num, i,j, fat=1;
		    Scanner sc = new Scanner(System.in); 		    
		    System.out.print("Digite a quantidade de numeros que serao lidos: ");		 
		    n = sc.nextInt();		    
		    for( i=1; i<=n ; i++ ){
		       System.out.println("\nDigite o "+ i +"º número: ");
		          num = sc.nextInt();	
		          fat=1;
		    for( j=2; j<=num ; j++ ){
		        fat = fat * j;
		   }		   
		    	System.out.println("O fatorial de " + num + " é = " + fat);
		    
		    }
	}
}
