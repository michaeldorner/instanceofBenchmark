package de.michaeldorner;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.*;


@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 128, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 1024, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(4)
@State(Scope.Benchmark)
public class MyBenchmark {

	private Base base;
	private List<Base> classes = Arrays.asList(new A(), new B(), new C(), new D(), new E(), new F(), new G(), new H(), new I(), new J());;
	private Random random = new Random();

	@Setup(Level.Trial)
	public void setup() {
		setNewClass();
	}

	@Setup(Level.Invocation)
	public void setNewClass() {
		int index = random.nextInt(classes.size());
		base = classes.get(index);
	}

	@Benchmark
	public void measureINSTANCEOF() {
		if (base instanceof A) {
			((A) base).doA();
		} else if (base instanceof B) {
			((B) base).doB();
		} else if (base instanceof C) {
			((C) base).doC();
		} else if (base instanceof D) {
			((D) base).doD();
		} else if (base instanceof E) {
			((E) base).doE();
		} else if (base instanceof F) {
			((F) base).doF();
		} else if (base instanceof G) {
			((G) base).doG();
		} else if (base instanceof H) {
			((H) base).doH();
		} else if (base instanceof I) {
			((I) base).doI();
		} else if (base instanceof J) {
			((J) base).doJ();
		}
	}

	@Benchmark
	public void measureOO() {
		base.doSomething();
	}

	@Benchmark
	public void measureTYPE() {
		switch (base.type) {
		case A:
			((A) base).doA();
			break;
		case B:
			((B) base).doB();
			break;
		case C:
			((C) base).doC();
			break;
		case D:
			((D) base).doD();
			break;
		case E:
			((E) base).doE();
			break;
		case F:
			((F) base).doF();
			break;
		case G:
			((G) base).doG();
			break;
		case H:
			((H) base).doH();
			break;
		case I:
			((I) base).doI();
			break;
		case J:
			((J) base).doJ();
			break;
		default:
			break;
		}
	}

	@Benchmark
	public void measureGETCLASS() {
		if (base.getClass() == A.class) {
			((A) base).doA();
		} else if (base.getClass() == B.class) {
			((B) base).doB();
		} else if (base.getClass() == C.class) {
			((C) base).doC();
		} else if (base.getClass() == D.class) {
			((D) base).doD();
		} else if (base.getClass() == E.class) {
			((E) base).doE();
		} else if (base.getClass() == F.class) {
			((F) base).doF();
		} else if (base.getClass() == G.class) {
			((G) base).doG();
		} else if (base.getClass() == H.class) {
			((H) base).doH();
		} else if (base.getClass() == I.class) {
			((I) base).doI();
		} else if (base.getClass() == J.class) {
			((J) base).doJ();
		}
	}
}