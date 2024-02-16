package basic_of_java;

import java.util.Scanner;

public class Java_practice {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int a=10;
		int b=20;
		System.out.println("Output(a+b)="+(a+b));
		//type casting and type conversion are same...
		int aa=20;
		double bb=(int)2.3d;
		System.out.println(aa+bb);
		/*
		 * size of data type
		 * 
		 * int 4bytes (-2 pow 31 to 2 pow 31-1)
		 * long 8bytes(-2 pow 63 to 2 pow 63-1)
		 * short 2bytes(-2 pow 15 to 2 pow 15-1)
		 * byte 1byte   (-2 pow 7 to 2 pow 7-1)
		 * float 4bytes
		 * double 8bytes
		 * char 2bytes
		 */
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number upto where you want to print::");
		int num=scn.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		int j=1;
		while(j<=num) {
			System.out.print(j+" ");
			j++;
		}
		System.out.println();
		int k=1;
		do {
			System.out.print(k+" ");
			k++;
		}while(k<=num);
		
	}
}
