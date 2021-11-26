import java.util.*;
class loop2
{
public static void main(String ar[])
{
	Scanner ob=new Scanner(System.in);
System.out.print("Enter a Table numbrr:");
int a=ob.nextInt();

	System.out.println("\n Table of the given number is: ");
for (int i=1; i<=10; i++)
System.out.println(i+"*"+a + "=" + i*a );
}
}