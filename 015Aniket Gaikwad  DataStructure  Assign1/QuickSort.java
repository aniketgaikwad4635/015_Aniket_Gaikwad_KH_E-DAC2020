package T6Sorting;

public class QuickSort {
	
    public void quicksortrec(int arr[],int low, int high){
    	int pi=partition(arr,low,high);
    	
    	if(low<pi-1) quicksortrec(arr,low,pi-1);
    	if(pi<high)  quicksortrec(arr,pi,high);
    }
    public int partition(int arr[],int low,int high) {
    	int pivot=arr[(low+high)/2];
    	
    	while(low<=high) {
    		
    		while(arr[low]<pivot) low++;
    		while(arr[high]>pivot) high--;
    		
    		if(low<=high) {
    			int temp=arr[low];
    			arr[low]=arr[high];
    			arr[high]=temp;
    			low++;
    			high--;
    		}
    	}
    	return low;
    }
    void display(int arr[]) {
    	for(int i=0;i<arr.length;i++) {
    		System.out.print(arr[i]+" ");
    	}
    }
	public static void main(String[] args) {
		QuickSort qs=new QuickSort();
		
		int arr[]=new int[] {10,20,30,40,11,22,33,44};
        int length=arr.length;
        
        qs.quicksortrec(arr,0,length-1);
        qs.display(arr);   
	}
}

