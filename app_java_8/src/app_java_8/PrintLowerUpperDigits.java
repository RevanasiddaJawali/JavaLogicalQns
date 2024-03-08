package app_java_8;

public class PrintLowerUpperDigits {
public static void main(String[] args) {
	String str="Pankaj Sir Academy@#1997";
	System.out.println("Lower cases:");
for (int i = 0; i <str.length(); i++) {
	if (str.charAt(i)>='a'&&str.charAt(i)<='z') {
		System.out.print(str.charAt(i));
	}
}
System.out.println("\n");
System.out.println("Upper cases:");
for (int i = 0; i <str.length(); i++) {
	if (str.charAt(i)>='A'&&str.charAt(i)<='Z') {
		System.out.print(str.charAt(i));
	}
}
System.out.println("\n");
System.out.println("Digits");
for (int i = 0; i <str.length(); i++) {
	if (str.charAt(i)>='0'&&str.charAt(i)<='9') {
		System.out.print(str.charAt(i));
	}
}
}
}
