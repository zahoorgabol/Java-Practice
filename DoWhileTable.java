import java.util.*;
class DoWhileTable
{
public static void main(String ar[])
{
	Scanner ob=new Scanner (System.in);
	char ch;
	do{
	System.out.print("enter last Table No:");
	int a=ob.nextInt();
	System.out.print("enter couunter No: ");
	int b=ob.nextInt();
	do{
	int i=1; 
	do{
		int j=1;
		{
			System.out.println(i+"X"+j+"="+(i*j));
			j++;
		}while(j<=b);
		
		{
			System.out.println();
			i++;
		}
	while(i<=a);
	System.out.println("Do you want to see more tables..??");
	ch=ob.next().charAt(0);
	}while(ch=='y' || ch=='Y');
}
}
}
	 
