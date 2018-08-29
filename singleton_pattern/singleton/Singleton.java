package singleton;

/**
 * 
 * @author robson
 * Exemplo de classe usando o padrão singleton.
 *
 */

public class Singleton {

	private static Singleton instancia = null;
	
	
	private Singleton(){
		
	}

	/**
	 * Retorna um objeto Singleton.
	 * 
	 * @return instancia
	 */
	public static Singleton getInstancia(){
		
		if (instancia ==null){
			System.out.println("Instancia criada ... ");
			instancia = new Singleton();
		}
		
		return instancia;
	}
	
}
