import java.util.*;
class WhileLoop2
{
	public static void main(String arg[])
	{
            Scanner ob=new Scanner(System.in);
System.out.println("enter two values: " );
int a=ob.nextInt();
int b=ob.nextInt();
char ch='y';
System.out.print("Enter Operator: "); 
ch=ob.next().charAt(0);
while(ch=='y' || ch=='Y')
{

// {
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
}
System.out.println("Do you want more cal: y/n");
ch=ob.next().charAt(0);
}
}
// }

/*
System.out.println("enter two values: " );
int c=ob.nextInt();
int d=ob.nextInt();
System.out.print("enter an operator: ");

ch=ob.next().charAt(0);
if(ch=='+')
{
	System.out.println("Addition is: " + (c+d));
}
if(ch=='-')
{
	System.out.println("Sub is:"+(c-d));
}
if(ch=='*')
{
	System.out.println("mul is:"+(c*d));
}
if(ch=='/')
{
	System.out.println("division is: " + (c/d));
		 }}
System.out.println("want more cal: y/N ?");
ch=ob.next().charAt(0);
	}
}*/