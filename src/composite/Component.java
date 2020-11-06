package composite;

public abstract class Component {
	
	protected String name;
	protected int level;
	
	public Component(String name) {
		this.name = name;
	}

	public String indentation() {
		String s ="";
		for(int i=0 ; i<level; i++) {
			s+="\t";
		}
		return s;
	}
	
	public abstract void print();

}
