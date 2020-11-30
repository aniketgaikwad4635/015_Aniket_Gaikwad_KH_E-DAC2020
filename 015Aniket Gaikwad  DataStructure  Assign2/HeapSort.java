package T6Sorting;

public class HeapSort {

	public static void main(String[] args) {
		int arr[]= {30,50,60,40,90,80,10};
		HeapSort hs=new HeapSort();
		hs.sort(arr);
		hs.printArray(arr);
	}
	void sort(int arr[]) {
		int length=arr.length;
		
		for(int i=length/2-1; i>=0; i--) {        //i calculate parent index 
			heapify(arr,length,i);                //first time pass array, length  ,parent index       
		}
		
		for(int i=length-1;i>=0;i--) { //after first heapify of parent/child here we swap parent to first pos
			                          //decrease length
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);      
		}
		
	}
	
	 void heapify(int arr[],int length ,int i) {         //array, length, parent index
		 int largest=i;
		 
		 int leftcd=2*i+1;
		 int rightcd=2*i+2;
		 
		 if(leftcd<length && arr[leftcd]>arr[largest]) {  //left child value > parent    change value of largest with child index
			 largest=leftcd;
		 }
		 if(rightcd<length && arr[rightcd]>arr[largest]) { //right child value > parent    change value of largest with child index
			 largest=rightcd;
		 }
		 
		 if(largest!=i) { //largest value changed means left/right child have greater value than parent then swap
			 int temp=arr[i];           //keep parent in temp
			     arr[i]=arr[largest];   //parent=greater value of left/right child
			     arr[largest]=temp;   //child=small value of parent 
			     heapify(arr,length,largest);
		 }
	}
	
	void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
		  System.out.print(arr[i]+" ");	
		}
	}
}

