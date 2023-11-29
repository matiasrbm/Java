package aula03;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		
		Figura f1 = new Figura();
		f1.nome = "Quadrado";
		f1.lados = 4;
		
		Figura f2 = new Figura();
		f2.nome = "Pentagono";
		f2.lados = 5;
		
		
		Figura f3 = new Figura();
		f3.nome = "Triângulo";
		f3.lados = 3;
		
		Figura f4 = new Figura();
		f4.nome = "Hexágono";
		f4.lados = 6;
		
		Figura f5 = new Figura();
		f5.nome = "Heptágono";
		f5.lados = 3;

		Insertion Sort(Ordenação por inserção) - Selection Sort(Ordenação por seleção) - Merge sort
		Binária
		Pilhas
		Errado
		1,2,3
		Push E Pop
		Homogêneos e de acesso aleatório por intermédio de índices
		
		ArrayList<Figura> listaFiguras = new ArrayList<Figura>();
		
		System.out.println("O tamanho da lista é:"
				+ listaFiguras.size());
		
		listaFiguras.add(f1);
		listaFiguras.add(f2);
		listaFiguras.add(f3);
		listaFiguras.add(f4);
		listaFiguras.add(f5);
		
		System.out.println("O tamanho da lista é:"
						+listaFiguras.size());
		
		for (int i = 0; i < listaFiguras.size(); i++) {

			System.out.println(listaFiguras.get(i).nome);
			System.out.println(listaFiguras.get(i).lados);
			
		}
	}

}

