package questoes;
import java.util.Scanner;
public class Questao_07 {
	public static void main(String[] args) {
		Questao_07 questao = new Questao_07();
		questao.executar();
	}
	
	public void executar() {
		System.out.println("*** Analize de dados dos times ***");
		Scanner sc = new Scanner(System.in);
		double peso, altura, mediaIdade, mediaAltura;
		int idade, menor, acima80;
		mediaAltura = 0;
		menor = 0;
		acima80 = 0;
		
		for (int times = 1; times <= 5; times++) {
			mediaIdade = 0;
			
			for (int jogador = 1; jogador <= 11; jogador++) {
				System.out.println("==== NOVO JOGADOR ====");
				System.out.print("Altura do jogador: ");
				altura = sc.nextDouble();
				
				System.out.print("Peso do jogador: ");
				peso = sc.nextDouble();
				
				System.out.print("Idade do jogador: ");
				idade = sc.nextInt();
				mediaAltura += altura;
				mediaIdade += idade;
				if (idade < 18) {
					menor += 1;
				}
				if (peso > 80) {
					acima80 += 1;
				}
			}
			System.out.println("Media de idade do time " + times + " : " + mediaIdade/100);
		}
		mediaAltura = mediaAltura / 55;	
		acima80 = acima80 * 100 / 55;
		
		System.out.println("Resultado: ");
		System.out.println("Menores de 18: " + menor);
		System.out.println("Media de altura: " + mediaAltura);
		System.out.println("Porcentagem de jogadores > 80Kg: " + acima80);
	}
	
	
}
