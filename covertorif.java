import java.util.*;
class convertorif
{public static void main(String ar[])
{
	String ob=new Scanner (System.in);
	System.out.print(" enter the quantity of a weight or length: ");
int quantity=ob.nextInt();
int kilo=quantity*1000;
int gram=quantity/1000;
int feet=quantity*12;
int miqdar=ob.nextInt();
if(miqdar==1)
{System.out.print("kilos are: " + kilo);}
if (miqdar==2)
{System.out.print("grams are: " + gram);}
if (miqdar==3)
{
System.out.print("feet are : " + feet);}
if(miqdar==4)
{System.out.print("Invalid choice!");}
}
}