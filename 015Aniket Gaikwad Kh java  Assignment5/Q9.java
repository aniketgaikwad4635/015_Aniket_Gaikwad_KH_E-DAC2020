package StringAssignment;
import java.util.Scanner;
public class Q9 {

	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
			
		System.out.println("Enter two words");
		String s=sc.nextLine();
		String q=sc.nextLine();
		char count[]=new char[s.length()+q.length()];
		System.out.println("Entered words are"+s+" "+q);
		
		outer:for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<q.length();j++)
			{
				if(s.charAt(i)==q.charAt(j))
				{
					count[i]=s.charAt(i);
					continue outer;
				}
			}
		}
	      String ind=new String(count);
	      
	      for(int i=0;i<count.length;i++)
		{   
			System.out.print(count[i]+" ");
		}
		
		

	}

}