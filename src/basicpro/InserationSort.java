package basicpro;

public class InserationSort {
static void method(int arr[]) { int item;
	for(int i=1;i<=arr.length-1;i++) {
		item=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>item) {
			arr[j+1]=arr[j];
			j--;
		}
		//after rection nagetive value -1
		arr[j+1]=item;
	}
}
}
