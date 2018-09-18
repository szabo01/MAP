package adapter.project;

public interface Image {
	
	public void desenhar(int pontoX, int pontoY, int altura, int largura);

	public String carregar(String arquivo, String extensao);


}
