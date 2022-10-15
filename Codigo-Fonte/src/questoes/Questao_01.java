package questoes;

import java.util.Scanner;

public class Questao_01 {
	public static void main(String[] args) {
		Questao_01 resolver = new Questao_01();
		resolver.executar();
	}
	//construtor
	public Questao_01() {}
	
	//métodos
	public void parOuImpar(double numero) {
		if (numero%2 == 0){
			  System.out.print("Esse número é par. \n");
			}
			else{
			  System.out.print("Esse número é ímpar. \n");
			}
	}
	
	public void executar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número para saber se ele é par ou ímpar: ");
		double num = sc.nextDouble();
		
		this.parOuImpar(num);
	}
}
