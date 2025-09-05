package exerciciosLista;

import java.util.ArrayList;
import java.util.List;

public class Exercicio5 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		String [] frutas = {
				"Maçã",
			    "Banana",
			    "Laranja",
			    "Morango",
			    "Abacaxi",
			    "Uva",
			    "Manga",
			    "Pêssego",
			    "Kiwi",
			    "Melancia"
		};
		
		for(int i = 0; i<frutas.length; i++) {
			list.add(frutas[i]);
		}
		
		list.remove(5);
		list.add(5, "Pitaya");
		
		for(String o : list) {
			System.out.println(o);
		}
	}

}
