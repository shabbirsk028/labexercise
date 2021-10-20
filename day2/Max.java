package day2;
import java.util.*;

public class Max {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size");
		int size=scan.nextInt();
		int[] num=new int[size];
		System.out.println("enter the number");
		for(int i=0;i<size;i++) {
			num[i]=scan.nextInt();
		}
		int max=0;
		for(int i=0;i<=size-1;i++) {
			if(max < num[i]) {
				max=num[i];
				
			}
		}
		System.out.println(max);

	}

}
