class PyramidName
{
	public static void main(String ar[])
	{
		String s1="Sindh";
            
		int l=s1.length();
	String s="";
		for(int i=0; i<=l; i++)
		{
			for(int j=0; j<i; j++)
			{
				char ch=s1.charAt(j);
			s+=ch;
			}
			System.out.print(s);
		}
		System.out.println();
	}

}