package day2;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the size");
		int size=scan.nextInt();
		int[] num=new int[size];
		System.out.print("enter the elements");
		for(int i=0;i<size;i++) {
			num[i]=scan.nextInt();
		}
		for(int i=num.length;i>0;i--) {
			System.out.println(i);
		}
		

	}

}