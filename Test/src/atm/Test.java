package atm;

public class Test {

	static A test(A a){
		a.setA(2000);
		return a;
	}
public static void main(String argv[])
{
	A a = new A(100);
	A b = test(a);
	System.out.println(a.getA());
	
}
}

class A{
	int a;
	A(int b){a=b;}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
}
