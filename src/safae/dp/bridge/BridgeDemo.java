package safae.dp.bridge;

public class BridgeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Color gr = new Green();
		Shape circle = new Circle();
		circle.applyColorForShape(gr);
		
		Color red = new Red();
		Shape sq = new Square();
		sq.applyColorForShape(red);
	}

}
