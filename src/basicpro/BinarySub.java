package basicpro;

public class BinarySub {
int method(int arr[],int key) {
	int low=0,high=arr.length-1;
	 while(low<=high){
		//for(int i=0;i<=arr.length-1;i++) {
		int mid=low+high/2;
		if(arr[mid]==key) {
			return mid;
		}
		else if(key>arr[mid]) {
			low=mid+1;
		}
		else
		{
			high=mid-1;
		//}
		}}
	return -1;

	 
}
}

