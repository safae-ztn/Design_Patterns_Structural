package safae.dp.decorator;

public class TurkeySandwichDecorator extends SandwichDecorator{

	public TurkeySandwichDecorator(Sandwich sandwich) {
		super(sandwich);
		// TODO Auto-generated constructor stub
	}
	
	public String make() {
		return this.sandwich.make() + " + Turkey";
	}

}
