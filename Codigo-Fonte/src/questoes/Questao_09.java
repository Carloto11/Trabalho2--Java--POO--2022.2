package questoes;
import java.util.Scanner;
public class Questao_09 {
	
	
	public static void main(String[] args) {
		
		Questao_09 questao = new Questao_09();
		questao.executar();
	}
	public void executar() {
		int soma, num, quantidade, maior, menor, impares;
		double mediaTotal, mediaPares;
		Scanner sc = new Scanner(System.in);
		
		soma = 0;
		num = 0;
		quantidade = 0;
		mediaPares = 0;
		mediaTotal = 0;
		impares = 0;
		maior = 0;
		menor = 0;
		while (true){
			System.out.println("Escreva mais um número: (30000 para sair) ");
			num = sc.nextInt();
			if (num == 30000)
				break;
			soma += num;
			quantidade += 1;
			if (num % 2 == 0) {
				mediaPares += num; 
			}else {
				impares += 1;
			}
			if (quantidade == 0) {
				maior = num;
				menor = num;
			}else {
				if (num > maior) {
					maior = num;
				}
				if (num < menor) {
					menor = num;
				}
			}
			
		}
		if (quantidade == 0) {
			System.out.println("Nenhum número foi cadastrado.");
		}else {
			mediaPares = mediaPares / quantidade;
			mediaTotal = soma/quantidade;
			System.out.println("A soma: " + soma);
			System.out.println("A quantidade: " + quantidade);
			System.out.println("Media dos numeros digitados: " + mediaTotal);
			System.out.println("O maior numero: " + maior);
			System.out.println("O menor numero: " + menor);
			System.out.println("A media dos numeros pares: "+ mediaPares);
			System.out.println("Porcentagem de numeros impares: %" + (impares * 100 / quantidade));
		}
		
	}
}
