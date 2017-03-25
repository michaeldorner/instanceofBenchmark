package de.michaeldorner;

public class G extends Base {
	
	public G() {
		super(Type.G);
	}
	
	public boolean isG() {
		return true;
	}

	public void doG() {
		i = i * -1;
	}
	
	@Override
	public void doSomething() {
		i = i * -1;
	}
}
