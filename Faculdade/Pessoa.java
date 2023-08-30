package aula01;

public class Pessoa {
	
	public String nome;
	public String matricula;
	public int idade;
	
	public void responderChamada(int resposta) {
		if(resposta ==1) {
			System.out.println("Presente!");
		} else {
			System.out.println("Faltou!");
		}
	}

}
