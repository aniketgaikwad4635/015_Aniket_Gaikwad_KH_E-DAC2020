package T6Sorting;

class Selsort{
	 void ssort(int arr[]) {	 
 	   for(int i=0;i<arr.length;i++) {		
			 int minIndex=i;
			 for(int j=i;j<arr.length;j++) {
				 if(arr[j]<arr[minIndex]) {
					 minIndex=j;
				 }
			 }
			 int temp=arr[i];
			 arr[i]=arr[minIndex];
			 arr[minIndex]=temp;
		 }	 
	   }
}
public class SelectionDemo {

	public static void main(String[] args) {
		int array[]=new int[] {5,4,3,2,1};
		Selsort ss=new Selsort();
		ss.ssort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}

	}

}
