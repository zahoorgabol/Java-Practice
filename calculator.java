import java.util.*;
class calculator
{public static void main(String arg[])
	{
Scanner ob=new Scanner(System.in);
System.out.print("Enter 1st the number:");
int num1=ob.nextInt();
System.out.print("enter the 2nd number:");
int num2=ob.nextInt();

System.out.print("enter your choice:");
int click=ob.nextInt();
if(click==1)
{System.out.print("addition is: "+(num1+num2));}


if(click==2)
{System.out.print("Subtraction is:" + (num1-num2));}


if(click==3)
{System.out.print("Multiplication is: " + (num1*num2));}


if(click==4)
{System.out.print("Division is: " + (num1/num2));}


if (click==5)
{System.out.print("Remainder is : " + (num1%num2));}


if(click>=6)
{System.out.print("plz give the number from 1 to 5 only");}
}}
