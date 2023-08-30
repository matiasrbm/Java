package aula02;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Francisco Molina";
		p1.matricula = "123456";
		p1.idade = 40;
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Rafael Matias";
		p2.matricula = "654321";
		p2.idade = 18;
		
		Pessoa p3 = new Pessoa();
		p3.nome = "Miguel";
		p3.matricula = "05360998";
		p3.idade = 19;
		
		Pessoa p4 = new Pessoa();
		p4.nome = "Pedro";
		p4.matricula = "31203887";
		p4.idade = 21;
		
		ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		
		System.out.println("O tamanho da lista é:"
				+ listaPessoas.size());
		
		listaPessoas.add(p1);
		listaPessoas.add(p2);
		listaPessoas.add(p3);
		listaPessoas.add(p4);
		
		System.out.println("O tamanho da lista é:"
				+ listaPessoas.size());	
		
		
		for (int i = 0; i < listaPessoas.size(); i++) {
			System.out.println(listaPessoas.get(i).nome);
			System.out.println(listaPessoas.get(i).matricula);
			System.out.println(listaPessoas.get(i).idade);
			
		}
	}

}
