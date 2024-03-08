package app_java_8;

public class RemoveWhiteSpaceOrAnything {
public static void main(String[] args) {
	String str="Pankaj Sir Academy@#1997";
	String s1 = str.replaceAll("\\s", "");
	System.out.println(s1);
	
	String s2 = str.replaceAll("a", "z");
	System.out.println(s2);
	
	String s3 = str.replaceAll("1997", "2023");
	System.out.println(s3);
}
}
