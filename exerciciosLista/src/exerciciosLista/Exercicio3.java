package exerciciosLista;

import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		String[] pecasCarro = {
			    "Radiador",
			    "Alternador",
			    "Amortecedor",
			    "Bomba de Combustível",
			    "Correia Dentada",
			    "Disco de Freio",
			    "Embreagem",
			    "Filtro de Ar",
			    "Vela de Ignição",
			    "Sensor de Oxigênio"
			};
		
		for(int i = 0; i<pecasCarro.length; i++) {
			list.add(pecasCarro[i]);
		}
		
		for(String o : list) {
			System.out.println(o);
		}
		
		System.out.println("Não venderemos mais Radiador :(, Venderemos filtro de ar");
		list.remove(0);
		list.add(0, "Filtro de Ar");
		
		for(String o : list) {
			System.out.println(o);
		}
	}

}
