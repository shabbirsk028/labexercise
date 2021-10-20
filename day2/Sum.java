package day2;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the size");
		int size=scan.nextInt();
		int[] num=new int[size];
		System.out.print("enter the elements");
		for(int i=0;i<size;i++) {
			num[i]=scan.nextInt();
		}
		for(int i=0;i<size;i++) {
			sum=sum+num[i];
			
		}
		System.out.println(sum);
	}

}