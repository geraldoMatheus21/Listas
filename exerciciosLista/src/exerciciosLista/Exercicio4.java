package exerciciosLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		String [] livros = {
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
		
		for(int i = 0; i<livros.length; i++) {
			list.add(livros[i]);
		}
		System.out.println("Nossa Lista do Hortfrut");
		for(String o : list) {
			System.out.println(o);
		}
		
		System.out.println("Digite qual fruta voce quer: ");
		int f = sc.nextInt();
		
		System.out.println(list.get(f));
		
		sc.close();
	}

}
