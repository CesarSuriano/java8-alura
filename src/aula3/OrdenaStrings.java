package aula3;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Comparator.comparing;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {
	public static <T> void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Cesar");
		palavras.add("TEste");
		palavras.add("Teste2");

		//isso
		palavras.sort(comparing(String::length));
		
		//é a mesma coisa que isso
//		Function<String, Integer> funcao = s -> s.length();
//		Comparator<String> comparador = Comparator.comparing(funcao);
		
		System.out.println(palavras);

		palavras.forEach(System.out::println);
	}
}
