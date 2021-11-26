import java.util.*;
class Ytodec
{
public static void main(String ar[])
{
Scanner ob=new Scanner (System.in);

System.out.print ("enter the years:");
int year=ob.nextInt();
int decade=year/10;
int ry=year%10;
System.out.println("decades are:"+ decade);
System.out.println("remaining years:" + ry);
}}