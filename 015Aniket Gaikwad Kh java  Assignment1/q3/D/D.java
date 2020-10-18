public class D{
  public static void main(String[] args){
   boolean x=true;
   boolean y=false;
   boolean z;

   z= x && y || !(x||y) ;
   System.out.println("x="+x+" y="+y+" z="+z);
  }
}