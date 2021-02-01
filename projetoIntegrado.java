package vetores;

import java.util.Scanner;
public class projetoIntegrado {
	public static void main (String[] args) {
		int idade;
		String nome;
		String sobrenome; 
		int c=0;
		
		int [][] cursos = new int[1][1]; 
		Scanner leia = new Scanner (System.in);
	
	
		System.out.println ("Entre com seu nome"); 
		nome =leia.next();
	

		System.out.print("Entre com sua idade");
		idade = leia.nextInt();
		if (idade>17 && idade<=30) {
		System.out.println ("Você é elegível para se candidatar");
	 } else {
		System.out.println ("Infelizmente você não pode participar");	
	} 
	 for (int i=0;i<1;i++) {
		System.out.println ("Os cursos são: ");
		
		System.out.println  ("1 -Banco de Dados - 2- JAVA 3 - HTML");
		cursos [i][c]=leia.nextInt();
		for ( c=0; c<1;c++)	 {
		
		System.out.println ("Matrix "+cursos[i][c]);
		}
		
	}
	}

}
