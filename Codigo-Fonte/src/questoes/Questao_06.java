package questoes;
import java.util.Scanner;
public class Questao_06 {
	
	public static void main(String[] args) {
		Questao_06 questao = new Questao_06();
		questao.executar();
	}
	
	public void executar() {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Escreva um número para verificar se é primo: ");
		int num = input.nextInt();
		if(this.verificarSePrimo(num)) {
			System.out.println("O número " + num + " é primo");
		}else {
			System.out.println("O número " + num + " não é primo");
		}
		
	}
	
	public boolean verificarSePrimo(int num) {
		int divisivel = 0;
		for (int i = num; i > 0; i--) {
			if (num % i == 0) {
				divisivel += 1;
			}
		}
		if (divisivel > 2) {
			return false;
		}else {
			return true;
		}
	}
}
