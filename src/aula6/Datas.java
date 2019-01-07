package aula6;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		
		LocalDate futuro = LocalDate.of(2099, Month.JANUARY, 25);
		
		Period period = Period.between(hoje, futuro);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String dataFormatada = formatador.format(hoje);
		
		System.out.println(dataFormatada);	
	}
	
}
