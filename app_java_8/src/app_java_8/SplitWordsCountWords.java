package app_java_8;

public class SplitWordsCountWords {
public static void main(String[] args) {
	String str="Pankaj Sir Academy@#1997";
	String[] s = str.trim().split(" ");
	System.out.println(s.length);
	for(String z : s) {
		//System.out.println(z);
	  StringBuffer sb= new StringBuffer(z);
	  StringBuffer r = sb.reverse();
	  System.out.print(r+" ");
	}
}
}
