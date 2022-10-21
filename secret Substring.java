package simpleJava;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String str1 = "abcde ABCDEF ";
		String str2 = "1234 1234";
		System.out.println(func(str1, str2));
		System.out.println(secret(str1, str2));

	}


	public static String func(String str1, String str2) {
		String ans = "";
		int i;
		int n1 = str1.length();
		int n2 = str2.length();
		int n = n1 > n2 ? n2 : n1;
		for (i = 0; i < n; i++) {
			ans += str1.charAt(i);
			ans += str2.charAt(i);
		}
		if (n >= n1)
			ans += str2.substring(i);
		else
			ans += str1.substring(i);
		return ans;
	}


	public static String secret(String str1, String str2) {
		String ans = "";
		String s1, s2;
		while (str1.length() > 0 && str2.length() > 0) {
			s1 = (str1.indexOf(" ") < 0) ? str1 : str1.substring(0, str1.indexOf(" "));
			s2 = (str2.indexOf(" ") < 0) ? str2 : str2.substring(0, str2.indexOf(" "));
			ans += func(s1, s2);
			ans += " ";
			str1 = (str1.indexOf(" ") > -1) ? str1.substring(str1.indexOf(" ") + 1) : "";
			str2 = (str2.indexOf(" ") > -1) ? str2.substring(str2.indexOf(" ") + 1) : "";
		}
		if (str1.length() > 0)
			ans += str1;
		if (str2.length() > 0)
			ans += str1;
		return ans;
	}

}

