package de.michaeldorner;

public class E extends Base {
	
	public E() {
		super(Type.E);
	}
	
	public boolean isE() {
		return true;
	}
	
	public void doE() {
		i = i * -1;
	}
	
	@Override
	public void doSomething() {
		i = i * -1;
	}
}
