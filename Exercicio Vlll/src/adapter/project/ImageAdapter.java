package adapter.project;

public class ImageAdapter implements ImageTarget {
	
	Image image;


	@Override
	public void desenharImagem(int pontoX, int pontoY, int altura, int largura) {
		image.desenhar(pontoX, pontoY, altura, largura);
	}

	@Override
	public String carregarImagem(String arquivo) {
		String ext = new String();
		ext.substring(arquivo.indexOf("."), (arquivo.length() - 1));

		if (ext.equals("jpg")) {
			image = new ImageJpeg();
			return image.carregar(arquivo, ext);
		} else if (ext.equals("png")) {
			image = new ImagePNG();
			return image.carregar(arquivo, ext);
		} else {
			image = new ImageBMP();
			return image.carregar(arquivo, ext);
		}
	}


}
