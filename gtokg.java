import java.util.*;
class Gtokg
{public static void main (String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.print("enter the total gram: ");
int g=ob.nextInt();
int kg=g/1000; 
int rg=g%1000;
System.out.println("kg are:" + kg);
System.out.print("remaining grams are: "+ rg);
}
}