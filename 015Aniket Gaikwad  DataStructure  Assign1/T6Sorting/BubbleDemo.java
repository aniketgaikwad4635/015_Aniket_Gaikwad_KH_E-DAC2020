package T6Sorting;

class Bsort{
	  void bsort(int arr[]) {
		  int size=arr.length;
		  for(int i=0;i<size;i++) {
			  for(int j=0;j<size-1;j++) {
				  if(arr[j]>arr[j+1]) {
					int  temp=arr[j] ;
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
				  }
			  }
		  }
	  }
}
public class BubbleDemo {
  
	public static void main(String[] args) {
		int array[]=new int[] {5,4,3,2,1};
		Bsort bs=new Bsort();
		bs.bsort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
