import java.util.*;
class RowColumn2
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.print("enter rows:");
int r=ob.nextInt();
System.out.print("enter columns:");
int c=ob.nextInt();
for(int i=1; i<=r; i++)
{
for(int j=1; j<=c; j++)
{
System.out.print("   "+j*i);
}
System.out.println();
}
}
}	