public class Casting{
 public static void main(String[] args){
   byte value1=125;
   byte value2=125;
   //System.out.println("value stored in short(2byte)="+value);
   byte downcast= (byte) (value1+value2);
   System.out.println("addition="+downcast);
 }
}