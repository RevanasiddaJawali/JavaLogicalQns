package app_java_8;

public class ArrayMaxMinSum {
public static void main(String[] args) {
	int[] x= {4,5,1,7,2,8,3,15,9,6,10};
	int max=0;
	int min=x[0];
	int sum=0;
	for (int i = 0; i < x.length; i++) {
		if (x[i]>max) {
		max=x[i];	
		}
	}
	System.out.println(max);
	for (int i = 0; i < x.length; i++) {
		if (x[i]<min) {
			min=x[i];
		}
	}
	System.out.println(min);
	for (int i = 0; i < x.length; i++) {
		sum=sum+x[i];
	}
	System.out.println(sum);
}
}
