package questoes;
import java.util.Scanner;
public class Questao_08 {
	
	public static void main(String[] args) {
		Questao_08 questao = new Questao_08();
		questao.executar();
	}
	
	
	public void executar() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("==== Operações com o salario ====");
			System.out.println("Qual operação deseja realizar: ");
			System.out.print(
					 "1 - Calcular imposto \n"
					+"2 - Calcular aumento \n"
					+"3 - Classificaçao \n"
					+"4 - Sair \n"
					+"Opcao escolhida: ");
			
			
			int opc = sc.nextInt();
			if (opc == 4) {
				break;
			}
			System.out.println("Digite seu salario: ");
			double salario = sc.nextDouble();
			
			switch(opc) {
				case 1:
					System.out.println("O Imposto sobre o salario foi de: R$" + this.imposto(salario));
					break;
				case 2:
					System.out.println("O aumento foi de: R$" + this.aumento(salario));
					break;
				case 3:
					System.out.println("A classificação é de: " + this.classificação(salario));
					break;
			}
		}
		System.out.println("Voce finalizou o programa.");
	}
	
	
	private double imposto(double salario) {
		if (salario > 850) {
			return salario * 0.15;
			
		}else if(salario >= 500 && salario <= 850){
			return salario * 0.1;
		}else {
			return salario * 0.05;
		}
	}

	private double aumento(double salario) {
		if (salario > 1500) {
			return salario + 25;
		}else if(salario >= 750 && salario <= 1500){
			return salario + 50;
		}else if(salario >= 450 && salario < 750){
			return salario + 75;
		}else {
			return salario + 100;
		}
	}
	private String classificação (double salario) {
		if (salario <= 700) {
			return "Mal remunerado.";
		}else {
			return "Bem remunerado.";
		}
	}
	
}
