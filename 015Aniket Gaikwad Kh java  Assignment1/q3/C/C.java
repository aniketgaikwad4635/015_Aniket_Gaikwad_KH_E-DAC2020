public class C{
  public static void main(String[] args){
   int x=5;
   int y=12;
   int z;

   z= x++ - --y - --x  +  x++ ;
   System.out.println("x="+x+" y="+y+" z="+z);
  }
}