class Nestedfor1
{
public static void main(String ar[])
{
	for(int i=1; i<=2; i++)
	{
		System.out.println("outer loop:"+i);
		
		for(int j=1; j<=5; j++)
		{
			System.out.println("inner:"+j);
		}
	}
}
}
