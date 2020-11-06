package composite;

public class CompositeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FolderComposite root = new FolderComposite("Design patterns");
		FolderComposite f1 = new FolderComposite("Design patterns structural");
		FolderComposite f2 = new FolderComposite("Design patterns behaviour");
		FolderComposite f3 = new FolderComposite("Design patterns creational");
		FolderComposite f4 = new FolderComposite("Practice");
		
		File file1 = new File("factory");
		File file2 = new File("singleton");
				
		root.addComponent(f1);root.addComponent(f2);root.addComponent(f3);
		f1.addComponent(new File("Decorator")); f1.addComponent(new File("Adapter")); f1.addComponent(new File("Composite"));
		f2.addComponent(new File("Observer")); f2.addComponent(new File("State"));
		f3.addComponent(file1); f3.addComponent(file2); f3.addComponent(f4);f4.addComponent(new File("TP1"));
		
		root.print();
	}

}
