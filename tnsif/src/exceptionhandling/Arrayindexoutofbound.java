package exceptionhandling;

public class Arrayindexoutofbound {                    //09-03-20206
public static void main(String[] args) {
	int arr[]=new int[4];
	try {
		int i=arr[6];
		System.out.println(i);
	}
	catch(ArrayIndexOutOfBoundsException r) {
		System.out.println(r);
	}
}
}