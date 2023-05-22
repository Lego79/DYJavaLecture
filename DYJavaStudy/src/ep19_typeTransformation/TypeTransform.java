package ep19_typeTransformation;

class A {
	
}

class B extends A {
	
}

class D extends B {
	
}

class C extends A {
	
}

class E extends C {
	
}


public class TypeTransform {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = new B();
		A a11 = b;
		
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		
		B b1 = d;
		C c1 = e;
		
		
		

	}

}
