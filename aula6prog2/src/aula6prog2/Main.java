package aula6prog2;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		a = b;
		b = (B) a;
		System.out.println(b);
		
		System.out.println(c);
		a = c;
		System.out.println(a);
		
		c = (C) a;
		System.out.println(c);
		
		b = c;
		c = (C) b;
		System.out.println(c);		
		
	}

}
