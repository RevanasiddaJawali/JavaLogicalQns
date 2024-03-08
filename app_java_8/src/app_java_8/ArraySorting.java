package app_java_8;

public class ArraySorting {
public static void main(String[] args) {
	int[] x= {4,5,1,7,2,8,3,9,6,10};
	for (int i = 0; i < x.length-1; i++) {
		for (int j = 0; j < x.length-1; j++) {
			if (x[j]>x[j+1]) {
				int temp=x[j];
				x[j]=x[j+1];
				x[j+1]=temp;
			}
		}
	}
	for (int i : x) {
		System.out.println(i);
	}
}
}
