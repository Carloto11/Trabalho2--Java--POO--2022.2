package questoes;

public class Questao_10 {
	public static void main(String[] args) {
		Questao_10 resolver = new Questao_10();
		resolver.tabuada();
	}
	public void tabuada() {
		for (int tabuada = 1; tabuada<=10; tabuada++) {
			System.out.println("\n");
			for (int variavel = 1; variavel<=10; variavel++) {
				System.out.println(variavel +" X " + tabuada + " = " + variavel*tabuada);
			}
		}
	}
}
