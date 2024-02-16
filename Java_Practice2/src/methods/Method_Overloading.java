package methods;

public class Method_Overloading {
	int add(int a,int b) {
		return a+b;
	}
	int add(int x,int y,double z) {
		return (int) (x+y+z);
	}
	public static void main(String[] args) {
		Method_Overloading mo=new Method_Overloading();
		System.out.println(mo.add(10, 20));
		System.out.println(mo.add(10, 20, 2.3));
	}
}
