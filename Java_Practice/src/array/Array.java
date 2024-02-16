package array;

public class Array {
	static int arr[]= {10,20,30,40,50};
	public static void main(String[] args) {
		for (int string : arr) {
			System.out.println(string);
		}
		System.out.println("========================");
		
		int arr_of[]=new int[5];
		arr_of[0]=10;
		arr_of[1]=11;
		arr_of[2]=12;
		arr_of[3]=13;
		arr_of[4]=14;
		
		System.out.println(arr_of[0]);
		
		for(int arrr:arr_of) {
			System.out.print(arrr+" ");
		}
	}
}
