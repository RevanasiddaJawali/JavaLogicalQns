package app_java_8;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String s1="RaCe";
	String s2="cArE";
	String s3 = s1.toLowerCase();
	String s4 = s2.toLowerCase();
	char[] c1 = s3.toCharArray();
	char[] c2 = s4.toCharArray();
	Arrays.sort(c1);
	Arrays.sort(c2);
	boolean val = Arrays.equals(c1, c2);
	if (val==true) {
		System.out.println("Given strings are anagram");
	} else {
      System.out.println("Given strings not anagram");
	}
}
}
