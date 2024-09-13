package basicpro;
import java.util.Scanner;
public class Binary {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter length:");
	int arr[]=new int[scan.nextInt()];
	System.out.println("enter "+arr.length+" element");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("enter key:");
	int key=scan.nextInt();
	BinarySub obj=new BinarySub();
	int ret=obj.method(arr, key);
	System.out.println(ret);
	/*if(ret>=0) {
	System.out.println("array is found "+arr[ret]);
}
	else {
		System.out.println("not found");}*/
}}
