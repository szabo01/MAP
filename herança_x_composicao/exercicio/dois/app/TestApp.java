package exercicio.dois.app;

import exercicio.dois.Passageiro;
import exercicio.dois.Pessoa;

public class TestApp {

	public static void main(String[] args) {

		
		Pessoa pessoa = new Pessoa ("Robson",  "Rua alderico pessoa de oliveira");
		
		Passageiro passageiro = new Passageiro(pessoa, 1);
		
		System.out.println(passageiro.getPessoa());
		
		
	}

}
