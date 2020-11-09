package ClassObjectInheritance;
class MathOperation1{
	int multiplyy(int x, int y){
		int multiplication=x*y;
		return multiplication;
	}
	float multiplyy(float x, float y,float z){
		float multiplication=x*y*z;
		return multiplication;
	}
	int multiplyy(int arr[]){
		int multiplication=1;
		for(int i=0;i<arr.length;i++) {
			multiplication=multiplication*arr[i];
		}
		return multiplication;
	}
	double multiplyy(double x, int y){
		double multiplication=x*y;
		return multiplication;
	}
}
public class Operations {

	public static void main(String[] args) {
		MathOperation1 math=new MathOperation1();
		System.out.println(math.multiplyy(10,5));
		System.out.println(math.multiplyy(10.0f,5.5f,8.5f));
		int arr[]= {1,2,3,4,5};
		System.out.println(math.multiplyy(arr));
		System.out.println(math.multiplyy(10.0,5));
	}

}
