package basicpro;
import java.util.Scanner;
public class BubbleSort {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length:"+"key");
		int key=scan.nextInt();
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter "+arr.length+" element");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		} System.out.println("before sorting");
		for(int x:arr) {
			System.out.println(x+" ");
		}
		BubbleSortApp obj=new BubbleSortApp();
		obj.method(arr);
		System.out.println("After sorting");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		BinarySub obj2=new BinarySub();
		int ren=obj2.method(arr, key);
		if(ren>0) {
			System.out.println(arr[ren]);
		}
		else {
			System.out.println(arr[ren]);
		}
	}
	}
