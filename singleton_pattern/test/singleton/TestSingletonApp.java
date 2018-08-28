package test.singleton;

import singleton.Singleton;
/**
 */
public class TestSingletonApp {
	private static final int TAMANHO = 100000;

	public static void main(String[] args) {
		

		Singleton singleton = null;
		
		for (int i = 0; i < TAMANHO; i++) {
			singleton = Singleton.getInstancia();
			
		}
	}

}
