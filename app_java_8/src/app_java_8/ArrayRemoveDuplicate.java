package app_java_8;

public class ArrayRemoveDuplicate {
public static void main(String[] args) {
	int [] x= {1,1,2,2,3,3,4,4,5,6,6,7,8,9,9};
	int []y=new int[x.length];
	int count=0;
	int j=0;
	for (int i = 0; i < x.length-1; i++) {
		if (x[i]!=x[i+1]) {
			y[j]=x[i];
			count++;
			j++;
		}
	}
	y[j]=x[x.length-1];
	for (int i = 0; i <=count; i++) {
		System.out.println(y[i]);
	}
}
}
