package de.michaeldorner;

public class F extends Base {

	public F() {
		super(Type.F);
	}

	public void doF() {
		i = i * -1;
	}

	@Override
	public void doSomething() {
		i = i * -1;
	}
}
