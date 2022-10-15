package questoes;

import java.util.Calendar;
import java.time.ZonedDateTime;

public class Questao_04 {	
	public static void main(String[] args) {
		Questao_04 resolver = new Questao_04();
		resolver.mostrarDataEHora();
	}
	public Questao_04() {}
	
	public void mostrarDataEHora () {
		Calendar calendar = Calendar.getInstance();
		String listaDosMeses[] = {"Janeiro", "Feveiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		int dia = calendar.get(Calendar.DAY_OF_MONTH);
		int mes = calendar.get(Calendar.MONTH);
		int ano = calendar.get(Calendar.YEAR);
		int hora = calendar.get(Calendar.HOUR_OF_DAY);
		int minuto = calendar.get(Calendar.MINUTE);
		
		System.out.println("Data atual: "+ dia + "/" + listaDosMeses[mes] + "/" + ano);
		System.out.println("O horário atual é " + hora + ":" + minuto);
	}
}