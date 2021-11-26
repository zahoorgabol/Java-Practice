import java.util.*;
class season
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.print("enter month: " );
String month=ob.next();

if(month.equals("11") || month.equals("12") || month.equals("1" ))
{
System.out.print("Winter season");

}
if(month.equals("2") || month.equals("3") || month.equals("4"))

	System.out.print("SPRING season");

if (month.equals("5")|| month.equals("6")|| month.equals("7") || month.equals("8"))

	System.out.print("SUMMER season");

if(month.equals("9")|| month.equals("10"))

	System.out.print("AUTUMN season");


 else
 { System.out.print("SORRY, the month you entered, does not denote any season. the number should be from 1 to 12!");
 
 }

}}