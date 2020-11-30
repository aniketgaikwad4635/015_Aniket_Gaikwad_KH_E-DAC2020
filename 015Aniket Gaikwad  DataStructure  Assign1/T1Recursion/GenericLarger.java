package T1Recursion;
class MyGeneric<T>{
	int larg;
	int second;
	int third;
	int x,y,z;
	void find(Integer a,Integer b,Integer c) {
		int x=a;
		int y=b;
		int z=c;
		int arr[]= {x,y,z};
		for(int i=0;i<arr.length;i++) {
			 if(arr[i]>larg) {
				 third=second;
				 second=larg;
				 larg=arr[i];
			 }
			 if(arr[i]>second && arr[i]!=larg) {
				 third=second;
				 second=arr[i];
			 }
			 if(arr[i]>third && arr[i]!=second &&arr[i]!=larg) {
				 third=arr[i];
			 }
		 }
		 System.out.println("third "+third);
	}
}
public class GenericLarger {

	public static void main(String[] args) {
		MyGeneric<Integer> mgi=new MyGeneric<Integer>();
		mgi.find(5,3,2);

	}

}
