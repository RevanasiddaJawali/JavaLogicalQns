package app_java_8;

public class Swapping {
public static void main(String[] args) {
	int x=10;
	int y=20;
 /*	int z=x+y;  //30
	x=z-x;  //20
	y=z-x;  //10
	System.out.println(x);
	System.out.println(y);*/
	x=x+y;  //30
	y=x-y;  //10
	x=x-y;  //20
	System.out.println(x);
	System.out.println(y);
}
}
