package exercicio.v;

import exercicio.iv.Veggies;
import exercicio.iv.PizzaNY.Cheese;
import exercicio.iv.PizzaNY.Clams;
import exercicio.iv.PizzaNY.Dough;
import exercicio.iv.PizzaNY.Pepperoni;
import exercicio.iv.PizzaNY.Sauce;

public interface PizzaBuilder {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();

}
