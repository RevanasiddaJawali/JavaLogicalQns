package app_java_8;

public class Fibonacci100 {
public static void main(String[] args) {
	int n=100, firstTerm=0, secondTerm=1;
	while (firstTerm<=n) {
		System.out.println(firstTerm+", ");
		int nextTerm=firstTerm+secondTerm;
		firstTerm=secondTerm;
		secondTerm=nextTerm;
	}
}
}
