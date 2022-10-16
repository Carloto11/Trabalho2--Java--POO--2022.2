package questoes;
import java.util.Scanner;
public class Questao_05 {

	
	public static void main(String[] args) {
		Questao_05  questao = new Questao_05();
		questao.executar();
	}

	
	public void executar() {
		Scanner input = new Scanner(System.in);
		System.out.print("Escreva um numero para o calculo fatorial: ");
		int num = input.nextInt();
		input.close();
		this.mostrarFatorial(num);
	}
	
	
	public void mostrarFatorial(int num) {
		int resultado = 1;
		for (int i = num; i >= 1; i --) {
			resultado *= i;
			if (i>1) {
				System.out.print(i + " * ");
			}else {
				System.out.print(i);
			}
		}
		System.out.print(" = " + resultado);
	}
	
}
