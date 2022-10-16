package principal;

import java.util.Scanner;
import questoes.*;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int escolha = 1;
		
		while (escolha != 0) {
			System.out.println("Escolha qual das opções solucionará seu problema: \n"
					+ "1 - Meu número é par ou ímpar? \n"
					+ "2 - Somar dois números ou tirar a raiz quadrada de um número \n"
					+ "3 - Resolver uma equação de segundo grau \n"
					+ "4 - Saber quais a data e a hora \n"
					+ "6 - Meu número é primo ou não? \n"
					+ "7 - Calculo dos jogadores \n"
					+ "8 - Menu de opções: \n"
					+ "\n"
					+ ". Imposto; \n"
					+ ". Novo salário; \n"
					+ ". Classificação; \n"
					+ ". Finalizar o progrma. \n"
					+ "9 - Programa que recebe vários números e mostra: \n"
					+ "\n"
					+ ". a soma dos números digitados; \n"
					+ ". a quantidade de números digitados; \n"
					+ ". a média dos números digitados; \n"
					+ ". o maior dos números digitados; \n"
					+ ". o menor número digitado; \n"
					+ ". a média de números pares; \n"
					+ "a porcentagem dos números ímpares dentre todos os digitados. \n"
					+ "10 - Tabuada de um a dez\n"
					+ "0 - para sair");
			escolha = sc.nextInt();
			
			switch(escolha) {
			case 1: Questao_01 resolver01 = new Questao_01();
			resolver01.executar(); 
			break;
			case 2: Questao_02 resolver02 = new Questao_02();
			resolver02.executar();
			break;
			case 3: Questao_03 resolver03 = new Questao_03();
			resolver03.executar();
			break;
			case 4: Questao_04 resolver04 = new Questao_04();
			resolver04.mostrarDataEHora();
			}
		}
	}
}
