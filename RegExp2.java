package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp2 {

	public static void main(String[] args) {
		String str="flyingreturn.base@airindia.in";
		String pattern="(\\w+)\\.(\\w+)\\@(\\w+)\\.(\\w{1,})";
		Pattern a=Pattern.compile(pattern);
		Matcher b=a.matcher(str);
		System.out.println(b.matches());
		System.out.println(b.group(0));
		System.out.println(b.group(1));
		System.out.println(b.group(2));
		System.out.println(b.group(3));
		System.out.println(b.group(4));
		if(b.group(4).equals("in")) {
			System.out.println("success");
		}
		else {
			System.out.println("fail");
		}

	}

}
