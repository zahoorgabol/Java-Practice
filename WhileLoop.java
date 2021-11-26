import java.util.*;
class WhileLoop
{
public static void main(String ar[])
{
	char ch='y';
	
while(ch=='y' || ch=='Y')
	{
	
		Scanner ob=new Scanner(System.in);
     System.out.println("enter two number:");
     int a=ob.nextInt();
     int b=ob.nextInt();
     System.out.println("addition is: " + (a+b));
     System.out.print("do  you want to do more calculation y/N?: ");
     ch=ob.next().charAt(0);
     /*System.out.println("enter two values: ");
     int c=ob.nextInt();
     int d=ob.nextInt();
     System.out.println("Subtraction is: " + (c-d));
     System.out.println("Do you want to do more calculation, y/N: ");
     ch=ob.next().charAt(0);
     */
}
}
}