package methods;

public class Methods_Practice {
	
	void display() {
		System.out.println("Hello World....");
	}
	static void displays() {
		System.out.println("Static world.......");
	}
	
	int add(int a,int b) {
		return a+b;
	}
	
	static int sub(int x,int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		displays();
		sub(10, 20);
		Methods_Practice mp=new Methods_Practice();
		mp.display();
		mp.add(10, 2);
		
	}

}
