package T2Array;

class Array{
	int n;
	int arr[];
	Array(){
		n=5;
		arr=new int[5];
	}
	void addAt(int i,int v) {
		arr[i-1]=v;
	}
	
	void search(int v) {
		boolean found=false;
		for(int i=0;i<n;i++) {
			if(arr[i]==v) {
				found=true;
				break;
			}
		}
		if(found) {System.out.println(v+" found in array");}
		else {System.out.println(v+" not found in array");}
	}
	
	void display() {
		for(int i=0;i<n;i++ ) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
public class ArrayOper {

	public static void main(String[] args) {
		Array a=new Array();
		a.addAt(1, 10);
		a.addAt(2, 20);
		a.addAt(3, 30);
		a.addAt(4, 40);
		a.addAt(5, 50);
        a.display(); 
        a.search(10);
        a.search(60);
        
	}
}

