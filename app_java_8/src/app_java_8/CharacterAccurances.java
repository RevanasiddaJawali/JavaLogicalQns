package app_java_8;

public class CharacterAccurances {
public static void main(String[] args) {
	String str="Pankaj Sir Academy@#1997";
     int x = str.length();
     
     String s = str.replaceAll("a", "");
     int y = s.length();
     int count =x-y;
     System.out.println(count);
}
}
