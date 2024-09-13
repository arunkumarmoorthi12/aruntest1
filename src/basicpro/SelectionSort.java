package basicpro;
                                        //86,15,20,39
public class SelectionSort {
public static void method(int arr[]) {
	for(int i=0;i<=arr.length-2;i++) {    
		int mini=arr[i];                     //mini=86
	    int pos=i;                           //0
	    int help;
		for(int j=i+1;j<=arr.length-1;j++) {     
			if(arr[j]<mini) {               //15<86
				mini=arr[j];                 //mini=15
				pos=j;                       //pos=1
				}
		}
		help=arr[i];          //help=86  
		arr[i]=arr[pos];     //arr[0]=15
		arr[pos]=help;           //pos[1]=86
	}
}
}
