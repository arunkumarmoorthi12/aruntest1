package basicpro;

public class AllSort {
void bubblesort(int arr[]) {
	for(int i=0;i<=arr.length-2;i++) {
		for(int j=0;j<=arr.length-2-i;j++) {
			if(arr[j]>arr[j+1]) {
				int help=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=help;
			}
		}
	}
}
void selectionsort(int arr[]) {
	int help,min,pos;
	for(int i=0;i<=arr.length-2;i++) {
		min=arr[i];
		 pos=i;
		for(int j=i+1;j<=arr.length-1;j++) {
			 if(arr[j]<min) {
				 min=arr[j];
				 pos=j;
			 }
			 help=arr[i];
			 arr[i]=arr[pos];
			 arr[pos]=help;
		}
	}
}
void inserationsort(int arr[]) {
	int item;
	for(int i=1;i<=arr.length-1;i++) {
		item=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>item) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=item;
	}
}
int linerationsearch(int arr[],int key) {
	for(int i=0;i<=arr.length-1;i++) {
		if(arr[i]==key) {
				return i;
			}
		}
	return -1;
	}
int binarysearch(int arr[],int key) {
	int high=arr.length-1;
	int low=0;
	while(low<=high){
	int mid=(high+low)/2;
	 if(key==arr[mid]) {
		 return mid;
	 }
	else if(key>arr[mid]) {
			low=mid+1;
		}
		else
		{
			high=mid-1;
		}
	}
	return -1;
}
                                            }
