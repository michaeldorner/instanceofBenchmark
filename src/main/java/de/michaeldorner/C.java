package de.michaeldorner;

public class C extends Base {
	
	public C() {
		super(Type.C);
	}
	
	public boolean isC() {
		return true;
	}

	public void doC() {
		i = i * -1;
	}
	
	@Override
	public void doSomething() {
		i = i * -1;
	}
}

