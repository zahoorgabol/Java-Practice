class TimerProject2
{
public static void main(String r[])
{
for(int y=0; y<=5; y++)
{ System.out.println("year"+y+" ");
	for(int mon=0; mon<=12; mon++)
		System.out.println("mon"+mon+"");
	{
		for(int d=0; d<=30; d++)
			System.out.println("day"+d+" ");
		{
			for(int h=0; h<=24; h++)
				System.out.println("hour"+h);
			{
				for(int m=0; m<=60; m++)
					System.out.println("mins"+m+" ");
				{
					for(int s=0; s<=60; s++)
						System.out.println("sec"+s);
					{
						for(int ms=0; ms<=7000; ms++)
					          System.out.println("miliSec"+ms);
					}
				}
			}
		}
	}
}
}
}
							