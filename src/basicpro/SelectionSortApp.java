package basicpro;
import java.util.Scanner;
public class SelectionSortApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter length:");
	int arr[]=new int[scan.nextInt()];
	System.out.println("enter element:"+arr.length);
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("before swap");
	for(int x:arr) {
	System.out.print(x+" ");}
	System.out.println("after swap");
	SelectionSort obj=new SelectionSort();
	obj.method(arr);
	for(int x:arr) {
		System.out.print(x+" ");
	}
}
}
