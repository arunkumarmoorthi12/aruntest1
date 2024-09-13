package basicpro;
import java.util.Scanner;
public class ArrayFirst {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Lenth:");
	int n=scan.nextInt();
	int[] arr= new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=scan.nextInt();
	}
	//int x;
	for(int x : arr) {
		System.out.print(x+" ");
	}
}
}
