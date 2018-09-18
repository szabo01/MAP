package adapter.project;

public interface ImageTarget {

	void desenharImagem(int pontoX, int pontoY, int altura, int largura);

	String carregarImagem(String arquivo);

}
