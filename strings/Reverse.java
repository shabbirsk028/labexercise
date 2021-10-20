package strings;
import java.util.*;

public class Reverse {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the name");
		String s=scan.next();
		String rev=" ";
		for(int i=0;i<=s.length()-1;i++) {
			rev=s.charAt(i)+rev;
			
		}
		System.out.println(rev);
		
	}

}
