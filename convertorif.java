import java.util.*;
class convertorif
{public static void main(String ar[])
{
	Scanner ob=new Scanner (System.in);
	System.out.print("entr your choice: " );
int miqdar=ob.nextInt();

if(miqdar==1)
{
	System.out.print("enter the grams:");
int gram=ob.nextInt();
int kilo=gram/1000;
	System.out.print("kilos are: " + kilo);}
	
if (miqdar==2)
{
	System.out.print("enter kilograms:");
int kg=ob.nextInt();
int grams=kg*1000;
	System.out.print("grams are: " + grams);}
	
if (miqdar==3)
{
	System.out.print("enter the inches: " );
int inches=ob.nextInt();
int feet=inches/12;
System.out.print("feet are : " + feet);}

if(miqdar>=4)
{System.out.print("Invalid choice!");}
}
}