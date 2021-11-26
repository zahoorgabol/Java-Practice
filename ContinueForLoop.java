class ContinueForLoop
 {
public static void main(String ar[])
    {
	Ali: for(int n=2; n<=50; n++)
	{
		for(int t=2; t<=n/2; t++)
		{	
		if(n%2==0)
		continue Ali;
			}
	System.out.println(n);
	}
}
}