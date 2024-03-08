package app_java_8;

public class FibonacciSeries {
public static void main(String[] args) {
	int n=12, firstTerm=0, secondTerm=1;
	
	for (int i = 1; i <=n; i++) {
		System.out.println(firstTerm+", ");
		int nextTerm=firstTerm+secondTerm;
		firstTerm=secondTerm;
		secondTerm=nextTerm;
	}
}
}
