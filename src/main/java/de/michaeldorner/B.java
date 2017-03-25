package de.michaeldorner;

public class B extends Base {
	
	public B() {
		super(Type.B);
	}
	
	public boolean isB() {
		return true;
	}

	public void doB() {
		i = i * -1;
	}
	
	@Override
	public void doSomething() {
		i = i * -1;
	}
}
