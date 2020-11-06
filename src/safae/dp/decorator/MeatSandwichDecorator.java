package safae.dp.decorator;

public class MeatSandwichDecorator extends SandwichDecorator{

	public MeatSandwichDecorator(Sandwich sandwich) {
		super(sandwich);
	}
	
	public String make() {
		return this.sandwich.make() + " + meat";
	}

}
