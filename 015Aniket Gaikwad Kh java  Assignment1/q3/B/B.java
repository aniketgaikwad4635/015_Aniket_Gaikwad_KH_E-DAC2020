public class B{
  public static void main(String[] args){
   int x=5;
   int y;

   y = x++ + ++x ;
   System.out.println("x="+x+" y="+y);
  }
}