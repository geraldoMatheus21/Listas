package exerciciosLista;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		String[] pessoas = {
			    "Ana Silva",
			    "Carlos Oliveira", 
			    "Maria Santos",
			    "João Pereira",
			    "Juliana Costa",
			    "Pedro Almeida",
			    "Fernanda Lima",
			    "Ricardo Souza",
			    "Amanda Rodrigues",
			    "Paulo Cardoso"
			};
		
		for(int i = 0;i<pessoas.length; i++) {
			list.add(pessoas[i]);
		}
		
		for(String o : list) {
			System.out.println(o);
		}
		
	}

}
