package algorithm.miscellenious;

public class ssss {

	
	public static void main(String args[]) {
		B b = new C();
		A a = b;
		C c = (C)a;
		c.m();
	}
}

interface A {
	void m();
}

class B implements A {

	@Override
	public void m() {
		System.out.print("B.m");
		
	}
	
}


class C extends B {

	@Override
	public void m() {
		System.out.print("C.m");
		
	}
	
}








