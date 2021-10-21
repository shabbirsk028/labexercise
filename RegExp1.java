package regexp;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp1 {
	public static void main(String[] args) {
		String str="1860 2233 1407";
		String pattern="(\\d{3,})\\s(\\d{3,})\\s(\\d{3,})";
		Pattern a=Pattern.compile(pattern);
		Matcher  b=a.matcher(str);
		System.out.println(b.matches());
		System.out.println(b.group(0)); 
		System.out.println(b.group(1)); 
		System.out.println(b.group(2)); 
		if(b.group(2).equals("2233")) {
			System.out.println("success");
		}
		else {
			System.out.println("fail");
		}
		
	}

}



