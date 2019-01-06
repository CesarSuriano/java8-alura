package aula1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
	public static void main(String[] args) {

		List<String> palavras =new ArrayList<String>();
		palavras.add("Cesar");
		palavras.add("TEste");
		palavras.add("Teste2");
		
		
		ComparadorPorTamanho comparador = new ComparadorPorTamanho();
		//por padrão o método sort ordena por ordem alfabética,já que a classe string define assim
		//Collections.sort(palavras, comparador);
		
		palavras.sort(comparador);
		System.out.println(palavras);
		
//		for (String p : palavras) {
//			System.out.println(p);
//		}
		
		Consumer<String> consumidor = new ImprimeNaLinha();
		palavras.forEach(consumidor);
	}
}

class ImprimeNaLinha implements Consumer<String>{

	@Override
	public void accept(String arg0) {
		System.out.println(arg0);
	}
	
}



class ComparadorPorTamanho implements Comparator<String>{

	//se argumento 1 < que o 2 retorna -1, o inverso 1, empate 0
	@Override
	public int compare(String arg0, String arg1) {
		if(arg0.length() < arg1.length()) {
			return -1;
		}
		if(arg0.length() > arg1.length()) {
			return 1;
		}
		
		return 0;
	}
	
}
