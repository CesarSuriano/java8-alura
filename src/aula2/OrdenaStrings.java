package aula2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Cesar");
		palavras.add("TEste");
		palavras.add("Teste2");

		palavras.sort((arg0, arg1) -> Integer.compare(arg0.length(), arg1.length()));
		System.out.println(palavras);

		palavras.forEach(arg0 -> System.out.println(arg0));
	}
}
