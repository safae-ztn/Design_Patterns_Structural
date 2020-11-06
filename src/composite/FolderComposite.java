package composite;

import java.util.ArrayList;
import java.util.List;

public class FolderComposite extends Component{

	private List<Component> components = new ArrayList<>();
	
	public FolderComposite(String name) {
		super(name);
	}

	@Override
	public void print() {
		String tab = indentation();
		System.out.println(tab+"Folder: "+name);
		for(Component c : components) {
			c.print();
		}
	}
	
	public Component addComponent(Component component) {
		component.level = this.level + 1;
		components.add(component);
		return component;
	}

}
