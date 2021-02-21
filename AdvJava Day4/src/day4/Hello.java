/**
 * 
 */
/**
 * @author HP
 *
 */
package day4;
import java.util.Map;
import java.util.HashMap;


public class Hello{
 public static void main(String[] args) {
	Map<String,String>map=new HashMap<>();
	map.put("city", "nagar");
	map.put("id","101");
	
	String o1 = map.get("city");
	
	Map<String,Object>map1=new HashMap<>();
	map1.put("city", "nagar");
	map1.put("id",101);
	
	String o2 =(String) map1.get("city");
	map1.get("city");
	
	System.out.println(o1 +" " +o2);
	

}
}