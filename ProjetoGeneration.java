package vetores;

import java.util.Scanner;
public class ProjetoGeneration {
public static void main (String args[]) throws InterruptedException {
				
				int idade, curso = 0, z=0;
				String nome;
				int Sao_Paulo;
				String [][] form = new String [6][6]; 
				String cursor = null;
				String estado = null;
				String email;
				Scanner leia = new Scanner (System.in);
				new Thread();		
				
				System.out.println("BEM VINDO A GENERATION!\n");
				Thread.sleep(3000);
				System.out.println("\nOlá amige, tudo bem? Eu sou o LouisBot, vou te ajudar em sua inscrição e preciso de alguns dados!");
				Thread.sleep(3000);
				System.out.println("\nVAMOS LÁ!!!");
				Thread.sleep(2000);		
				System.out.println("\nQual seu nome completo amige?");
				nome = leia.nextLine();
				System.out.println("Bem vindo, "+nome+"!\n");
				
				form [0][0] = "Nome";
				form [1][0]	= nome;		
				
				Thread.sleep(1000);
				
				while (z != 1) {
						
				do {		
					System.out.print(nome+", entre com sua idade:");
					idade = leia.nextInt();	
					if (idade <=17 || idade >=31) {
					System.out.println("Idade não permitida!!!!");
						}								
					} while (idade <=17 || idade >=31);
				
				String idade1 = Integer.toString(idade);
				
				form [0][1] = "Idade";
				form [1][1]	= idade1;	
						
				System.out.println("\nCARREGANDO...\n"); Thread.sleep(1000);
				
				
				System.out.println("\nVocê mora no estado de São Paulo, "+nome+"?"+"\nDIGITE: '1 -SIM' ou '2 - NÃO'");
				Sao_Paulo = leia.nextInt();
				
				if (Sao_Paulo == 1) {System.out.println("\nParabéns, agora falta pouco....."); estado = "São Paulo"; }
				
				else {System.out.println("\nPoxa vida, não foi desta vez, tente na próxima! ;)"); System.exit(0);}
				
				form [0][3] = "Estado";
				form [1][3]	= estado;	
				
				System.out.println("\nQual seu e-mail de contato, "+nome+"?\n");
				email = leia.next();
				
				form [0][4] = "E-mail";
				form [1][4]	= email;
										
				System.out.println(nome+", legal! Qual curso você pretende fazer?\n");
				
				System.out.println("1.Banco de dados - 2.JAVA - 3.Python\n");
				
				
				do {
				System.out.print("Digite sua opção:");
				curso = leia.nextInt();
				System.out.println("\nCARREGANDO...\n"); Thread.sleep(1000);	
				if (curso<=0 || curso>=4) {
				System.out.println(nome+", Opção inválida!");}
				
				}while (curso<=0 || curso>=4);
				
				switch (curso) {
				
				case 1: 
					System.out.println(nome+", você escolheu o curso de Banco de Dados."
							+ "\nEste curso tem duração de 500h com um sistema semi-presencial. "
							+ "Horário: Seg à Sex, das 8h às 17h."); break;
									
				case 2: 
				System.out.println(nome+", você escolheu o curso de JAVA.\n"
						+ "Este curso tem duração ALL LIFE LEARNIG, com um sistema à distância. "
						+ "Horário: Seg à Sex, das 0h às 23h59."); break;
						
				case 3: 
					System.out.println(nome+", você escolheu o curso de Python.\n"
							+ "Este curso tem duração de 300h, com um sistema presencial. "
							+ "Horário: Seg à Sex, das 19h às 22h30."); break;
				} 
				if (curso==1) {cursor = "Banco de Dados";}
				if (curso==2) {cursor = "JAVA";}
				if (curso==3) {cursor = "Python";}			
				form [0][2] = "Curso";
				form [1][2]	= cursor;
				
				Thread.sleep(2000);
													
				System.out.printf("\nSEU CADASTRO FOI FINALIZADO!\n");			
				System.out.printf("\n[%s: %s]",form[0][0],form[1][0]);
				System.out.printf("\n[%s: %s]",form[0][1],form[1][1]);
				System.out.printf("\n[%s: %s]",form[0][2],form[1][2]);
				System.out.printf("\n[%s: %s]",form[0][3],form[1][3]);
				System.out.printf("\n[%s: %s]",form[0][4],form[1][4]);
				
				System.out.printf("\n\nPodemos confirmar?\nDIGITE 1 - CONFIRMAR CADASTRO / 2 - REFAZER CADASTRO\n");
				z = leia.nextInt();
					 
					if (z == 2) { System.out.printf("\nCARREGANDO...\n"); Thread.sleep(2000);}
				} 
							
				Thread.sleep(3000);
				
				System.out.printf("\n<3  Entraremos em contato para as próximas etapas! :D s2\n"
						+ " \n");
				
				
			}
				
				
				
		}
