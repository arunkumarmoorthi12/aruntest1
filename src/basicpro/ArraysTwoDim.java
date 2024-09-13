package basicpro;
import java.util.Scanner;
public class ArraysTwoDim {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter length:");
	int arr[]=new int[scan.nextInt()];
	System.out.println("Enter "+ arr.length +" element");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("Enter key");
	int key=scan.nextInt();
	LinearSearch obj=new LinearSearch();
	int ret=obj.search(arr, key);
	if(ret>=0) {
	System.out.println(arr[ret]+" match "+ret);}
	else 
		{System.out.println("Not match ");}
}
}

