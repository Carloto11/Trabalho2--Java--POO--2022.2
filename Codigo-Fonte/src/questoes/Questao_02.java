package questoes;

import java.util.Scanner;

public class Questao_02 {
	public static void main(String[] args) {
		Questao_02 resolver = new Questao_02();
		resolver.executar();
	}
	
	//métodos
	
	public void somarDoisNumeros (double num01, double num02) {
		double soma = num01 + num02;
		System.out.println(soma);
	}
	
	public void raizQuadrada(double numero) {
		double raizQuadrada = Math.sqrt(numero);
		if(numero < 0) {
			System.out.println("Não existe raiz quadrada de número negativo.");
		}
		else {		
			System.out.println("Resultado positivo da raiz: " + raizQuadrada + "Resultado negativo da raiz: " + -raizQuadrada);
		}		
	}
	
	public void executar() {
		Scanner sc = new Scanner (System.in);
		int segundaEscolha = 1;
		
		while(segundaEscolha == 1 || segundaEscolha == 2) {
			System.out.println("Qual das duas operações deseja realizar? \n"
					+ "1 - Somar dois números;"
					+ "2 - Raiz Quadrada de um número.");
			segundaEscolha = sc.nextInt();
			
			if(segundaEscolha == 1) {
				System.out.println("Digite o primeiro número: ");
				double num1 = sc.nextDouble();
				
				System.out.println("Digite o segundo número: ");
				double num2 = sc.nextDouble();
				
				this.somarDoisNumeros(num1, num2);
			}
			else if(segundaEscolha == 2) {
				System.out.println("Digite o número: ");
				double num = sc.nextDouble();
				
				this.raizQuadrada(num);
			}
			else {
				System.out.println("Inválido!");
			}
		}
	}
}
