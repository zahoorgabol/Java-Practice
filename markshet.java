import java.util.*;
class markshet
{
public static void main(String ar[])
{
Scanner a=new Scanner (System.in);
System.out.print("enter the java marks:");
int java=a.nextInt();

System.out.print("enter c++ marks:");
int cpp=a.nextInt();

System.out.print("enter pathon marks:");
int pathon=a.nextInt();

System.out.print("enter C marks: " );
int c=a.nextInt();
System.out.print("enter php marks: ");
int php=a.nextInt();
int mark=500;
int obt=java+cpp+pathon+c+php;
int grade=obt;
int percent=obt*100/mark;
System.out.println("total marks: " + mark);
System.out.println("obtained marks are: " + obt);
System.out.println("Percentage is: " + percent);

if(percent>=90)
{System.out.print(" Grade: A+");}

if(percent<90 && percent>=80)
{System.out.print("Grade: A");}

if(percent<80 && percent>=70)
{System.out.print("Grade: B");}

if(percent<70 && percent>=60)
{System.out.print("Grade: C");}

if (percent<60 && percent>=50)
{System.out.print("Grade: D");}

if (percent<50 && percent>=35)
{System.out.print("Pass only");}

if (percent<35)
{System.out.print("FAILLL");}
}}


