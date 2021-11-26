import java.util.*;
class WhileLoop34
{
	public static void main(String arg[])
	{
            Scanner ob=new Scanner(System.in);
char ch2='y';
while(ch2=='y' || ch2=='Y')
{
	System.out.println("enter two values: " );
int a=ob.nextInt();
int b=ob.nextInt();
char ch;

System.out.print("Enter Operator: "); 

ch=ob.next().charAt(0);
if(ch=='+')
{
System.out.println("addition is: " + (a+b));
}

else if (ch=='-')
{
	System.out.println("sub is: " + (a-b));
}
	
else if (ch=='*')
{
	System.out.println("mul is: " + (a*b));
		}
else if(ch=='/')
		{
			System.out.println("division is:"+(a/b));
		}
		else{
			System.out.println("Invalid Operator");
		}

System.out.println("Do you want more cal: y/n");
ch2=ob.next().charAt(0);

}
}
}