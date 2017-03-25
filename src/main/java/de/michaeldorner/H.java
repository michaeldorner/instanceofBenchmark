package de.michaeldorner;

public class H extends Base {
	
	public H() {
		super(Type.H);
	}
	
	public boolean isH() {
		return true;
	}

	public void doH() {
		i = i * -1;
	}
	
	@Override
	public void doSomething() {
		i = i * -1;
	}
}
