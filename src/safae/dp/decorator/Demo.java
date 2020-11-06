package safae.dp.decorator;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sandwich sandwich = new MeatSandwichDecorator(new SimpleSandwich());
		System.out.println(sandwich.make());

		Sandwich san = new TurkeySandwichDecorator(new SimpleSandwich());
		System.out.println(san.make());
		
		Sandwich s = new MeatSandwichDecorator(new TurkeySandwichDecorator(new SimpleSandwich()));
		System.out.println(s.make());
		
		Sandwich sa = new TurkeySandwichDecorator(new MeatSandwichDecorator(new SimpleSandwich()));
		System.out.println(sa.make());
	}

}
