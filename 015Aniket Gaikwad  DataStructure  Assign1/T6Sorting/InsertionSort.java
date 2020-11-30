package T6Sorting;

class Insersort{
	void isort(int arr[]) {
	for(int i=0;i<arr.length;i++) {	
	 int temp=arr[i];
	 int j=i-1;
	 while(j>=0 && arr[j]>temp) {
		 arr[j+1]=arr[j];
		 j--;
	 }
	 arr[j+1]=temp;
	}	
   }
} 
public class InsertionSort {

	public static void main(String[] args) {
		int array[]=new int[] {5,4,3,2,1};
		Insersort is=new Insersort();
		is.isort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}

