package basicpro;
import java.util.Scanner;
public class AllSortFind {
	public static void main(String[] args) {
		
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter length of array:");
	int arr[]=new int[scan.nextInt()];
	System.out.println("enter values:");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("Before sort");
	for(int x:arr) {
		System.out.print(x+" ");
	}
	System.out.println();
	System.out.println("1---bubblesort");
	System.out.println("2---selectionsort");
	System.out.println("3--inserationsort");
	System.out.println("Enter opation:");
	int a=scan.nextInt(); 
	AllSort obj=new AllSort();
	switch (a) {
	case 1:obj.bubblesort(arr);
	break;
	case 2:obj.selectionsort(arr);
	break;
	case 3:obj.inserationsort(arr);
	break;
	default:obj.selectionsort(arr);}
	System.out.println("After sorting");
	for(int y:arr) {
		System.out.print(y+" ");
	}
	System.out.println();
	System.out.println("Enter key:");
	int key=scan.nextInt();
	int ren=obj.binarysearch(arr,key);
	if(ren>0) {
		System.out.println("key this found:"+ren);
	}
	else {
		System.out.println("Key not found");
	}
}
}
