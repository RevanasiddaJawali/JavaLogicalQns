package app_java_8;

public class ReverseStringNumberArray {
public static void main(String[] args) {
	String str="Pankaj Sir Academy@#1997";
	String rev="";
	for (int i = str.length()-1; i >=0; i--) {
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);
	
	int x=1234;
	String s = String.valueOf(x);
	String r="";
	for (int i = s.length()-1; i>=0; i--) {
		r=r+s.charAt(i);
	}
	System.out.println(r);
	
	int []y= {1,2,3,4,5};
	for (int i = y.length-1; i >=0; i--) {
		System.out.print(y[i]);
	}
	
}
}
