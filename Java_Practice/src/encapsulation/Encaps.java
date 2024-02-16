package encapsulation;

public class Encaps {
	private String name;
	private String owner;
	private long number;
	public void setName(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		Encaps en=new Encaps();
		en.setName("hari");
		//en.getName();
		System.out.println(en.getName());
	}
}//class
