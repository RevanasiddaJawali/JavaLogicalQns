package app_java_8;

public class Palindrome {
public static void main(String[] args) {
	String str="kanak";
	String rev="";
	for (int i = str.length()-1; i >=0; i--) {
		rev=rev+str.charAt(i);
		
	}
	System.out.println(rev);
	if (str.equals(rev)) {
		System.out.println("Given String is Palindrome");
	}else {
		System.out.println("not palindrome");
	}
}
}
