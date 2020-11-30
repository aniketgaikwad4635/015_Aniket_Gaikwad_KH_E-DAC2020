package T6Sorting;

public class MergeSort {
	int arr[];
	int tempMergeArr[];
	int length;
	
	public static void main(String[] args) {
		MergeSort ms=new MergeSort();
		int inputarr[]=new int[] {10,20,30,40,11,21,31,41};
		ms.sort(inputarr);
		for(int i: inputarr) {
			System.out.print(i+" ");
		}
		
	}
	void sort(int inputarr[]) {
		this.arr=inputarr;
		this.length=inputarr.length;
		this.tempMergeArr=new int [length];
		divideArray(0,length-1);
		
	}
	void divideArray(int lowerindex,int higherindex) {
	  if(lowerindex<higherindex) {
		int middle=lowerindex+  (higherindex-lowerindex)/2;
		
		 divideArray(lowerindex,middle);
		 divideArray(middle+1,higherindex);
		
		 mergeArray(lowerindex,middle,higherindex) ;
      }   
	}
	void mergeArray(int lowerindex,int middle,int higherindex) {
		for(int i=lowerindex;i<=higherindex;i++){
			tempMergeArr[i]=arr[i];
		}
		
		int i=lowerindex;
		int j=middle+1;
		int k=lowerindex;
		
		while(i<=middle && j<=higherindex) {
			if(tempMergeArr[i]<=tempMergeArr[j]) {
				arr[k]=tempMergeArr[i];
				i++;
			}
			else {
				arr[k]=tempMergeArr[j];
				j++;
			}
		  k++;	
		}
		
		while(i<=middle) {
			arr[k]=tempMergeArr[i];
			k++;
			i++;
		}
	}
}
