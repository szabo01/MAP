package adapter.project;

public class ImageJpeg implements Image{
	
	@Override
	public String carregar(String arquivo, String extensao) {
		extensao = "jpg";
		return "esta eh uma imagem."+"extensao";

	}

	@Override
	public void desenhar(int pontoX, int pontoY, int altura, int largura) {
		// TODO Auto-generated method stub
		
	}

}
