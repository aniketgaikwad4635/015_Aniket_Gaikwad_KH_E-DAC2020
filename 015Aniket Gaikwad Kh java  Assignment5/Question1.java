package StringAssignment;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        String cha[]=str.split(" ");
        int vowel=0;
        int conson=0;
        int num=0;
        int symbol=0;
     outer: for(int i=0;i<cha.length;i++) {
        	char ch[]=cha[i].toCharArray();
         for(int j=0;j<ch.length;j++){
        	
        	int asc=(char)ch[j];
        	if((asc>=65&&asc<=90)||(asc>=96&&asc<=122)) {
        	    if(ch[j]=='A'||ch[j]=='a'||ch[j]=='E'||ch[j]=='e'||ch[j]=='I'||ch[j]=='i'||ch[j]=='O'||ch[j]=='o'||ch[j]=='U'||ch[j]=='u'){
        		vowel++;
        	    }
        	    else {
        	    	conson++;
        	    }
             }
        	else if(asc>=48&&asc<=57) {
        		num++;
        		continue outer;
        	}
        	else {
        		symbol++;
        	}
           }
         }
        System.out.println("vowel="+vowel);
        System.out.println("consonant="+conson);
        System.out.println("number="+num);
        System.out.println("symbol="+symbol);
	}
}
