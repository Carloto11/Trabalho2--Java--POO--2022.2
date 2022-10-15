package questoes;

import java.util.Scanner;

public class Questao_03 {
	public static void main(String[] args) {
		Questao_03 resolver = new Questao_03();
		resolver.executar();
	}
	
	//construtor
	public Questao_03() {}
	
	//metodos
	public void resolverDelta(double a, double b, double c) {
		double delta = ((Math.pow(b,2)) - (4*a*c));	
	}
	
	public void resolverComum(double delta, double b, double a) {
		double raizDeDelta = Math.sqrt(delta);
		
		double x1 =  (-b + raizDeDelta)/(2*a);
    	double x2 = (-b - raizDeDelta)/(2*a) ;
    	
    	System.out.println("Seu x1 é: " + x1 + ". Seu x2 é: " + x2);
	}
	
	public void resolverSemB(double c, double a) {
        if(c < 0) {
        	double c1 = (c * -1);
        	double x1 = Math.sqrt(c1/a);
        	double x2 = (-x1);
        	System.out.println("Esse é o X1: " + x1 + " Esse é o X2: " + x2);
        	}
        else {
        	double x1 = Math.sqrt(-c/a);
        	double x2 = (x1);
        	System.out.println("Esse é o X1: " + x1 + " Esse é o X2: " + x2);
        }
        
	}
	public void resolverSemC (double b, double a) {
		double x1 = 0;
		double x2;
		
		if(b<0) {
			x2 = (b*-1)/a;
			System.out.println("Se X1 é: " + x1 + " Seu X2 é: " + x2);
		}
		else {
			x2 = -b/a;
			System.out.println("Se X1 é: " + x1 + " Seu X2 é: " + x2);
		}
	}
	public void executar() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos resolver sua equação de segundo grau!");
		
		System.out.println("Digite seu a: ");
		double a = sc.nextDouble();
		
		System.out.println("Digite seu b: ");
		double b = sc.nextDouble();
		
		System.out.println("Digite seu c: ");
		double c = sc.nextDouble();
		
		if(a == 0) {
			System.out.println("Isso não é uma equação de segundo grau!");
		}
		else if(b == 0) {
			this.resolverSemB(c,a);
		}
		else if(c == 0) {
			this.resolverSemC(b, a);
		}
		else {
			this.resolverDelta(a, b, c);
			this.resolverComum(a, b, c);
		}
	}
}
