import java.util.*;
class showletters
{
public static void main(String sr[])
{
Scanner ob=new Scanner(System.in);
System.out.print("enter a nnumber: " );
      // int num=ob.nextInt();
	String num=ob.next();
	int size=num.length();
 String s="";
      for (int i=1; i<=size; i++);
	{
      char j=num.charAt(i);
	s+=j; 
	System.out.println(s);  
	}	

}
}