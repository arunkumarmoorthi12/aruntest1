package basicpro;
import java.util.Scanner;
public class Inseration {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter length of array:");
	int arr[]=new int[scan.nextInt()];
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("Before sort");
	for(int x:arr) {
		System.out.print(x+" ");
	}
	InserationSort.method(arr);
	System.out.println("After sort");
	for(int x:arr) {
		System.out.print(x+" ");
	}
	
}
}
