package exercicio.dois;

public class Tripulante {

	
	private Pessoa pessoa;
	private int idTripulante;
	
	public Tripulante(Pessoa pessoa, int idTripulant){
		this.pessoa = pessoa;
		this.idTripulante = idTripulant;
	}
	
	public int getIdTripulante() {
		return idTripulante;
	}
	public void setIdTripulante(int idTripulante) {
		this.idTripulante = idTripulante;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
}
