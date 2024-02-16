package array;

public class MultiDimensional_Array {
	
	
	
	
	public static void main(String[] args) {
		int marr[][]=new int [3][4];
		/*   j j j j
		 * i=1 2 3 4
		 * i=5 6 7 8
		 * i=9 10 11 12
		 */
		marr[0][0]=1;
		marr[0][1]=2;
		marr[0][2]=3;
		marr[0][3]=4;
		marr[1][0]=5;
		marr[1][1]=6;
		marr[1][2]=7;
		marr[1][3]=8;
		marr[2][0]=9;
		marr[2][1]=10;
		marr[2][2]=11;
		marr[2][3]=12;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(marr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
