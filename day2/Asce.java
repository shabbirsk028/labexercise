package day2;

import java.util.Scanner;

public class Asce {

	public static void main(String[] args) {
		int temp=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the size");
		int size=scan.nextInt();
		int[] num=new int[size];
		System.out.print("enter the elements");
		for(int i=0;i<size;i++) {
			num[i]=scan.nextInt();
		}
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
	}

}
