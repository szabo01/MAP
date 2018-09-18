package client;

import adapter.project.ImageAdapter;
import adapter.project.ImageTarget;

public class Client {
	public static void main(String[] args) {
		ImageTarget im = new ImageAdapter();
		im.desenharImagem(0, 0, 0, 0);
		System.out.println(im.carregarImagem("imagem.jpg"));
		System.out.println(im.carregarImagem("imagem.png"));
		System.out.println(im.carregarImagem("imagem.bmp"));
	}
}
