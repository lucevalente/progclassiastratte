package abs;

interface A {
	void hello();
}

abstract class C3 implements A {

}

class C1 implements A {

	@Override
	public void hello() {

	}

}

class C2 extends C1 {

}

abstract class Abs {
	// non può essere istanziata(new), ha dei metodi che i figli sono obbligati a
	// definire

	private int val;

	public Abs(int val) {
		this.val = val;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public void hello() {
		System.out.println("Time " + getTime());
	}

	public abstract String getTime(); // i metodi abstract devono ridefinirli le classi figlie
}

class AbsSoon extends Abs {

	public AbsSoon(int val) {
		super(val);
	}

	@Override
	public String getTime() {
		return "ciao";
	}

}

public class Test {

	public static void main(String[] args) {

		A a = new C1();
		a.hello();
		C2 c2 = new C2();
		c2.hello();
		A aa = new C2(); // anche c2 è di tipo A, perchè una classe eredita tutti i metodi pubblici della
							// classe padre, quindi eredita anche i metodi dell'interfaccia
		aa.hello();
		Abs abs = new AbsSoon(3); // le classi astratte non si possono istanziare, ma si possono fare le new con
									// le classi figlie
		abs.hello();
		abs.getTime();

	}

}
