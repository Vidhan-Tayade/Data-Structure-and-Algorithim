/*
	1 2 3 4 5
	1 2 3 4 5
	1 2 3 4 5
	1 2 3 4 5
	1 2 3 4 5
*/
class Sheet1Pattern1
{
	public static void main(String args[])
	{
		//Using 2 loops
		System.out.println("\nUsing Brute force technique :");
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=5 ; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//Using String and 1 loops
		System.out.println("\nUsing String technique :");
		String s="1 2 3 4 5";
		for(int i=1 ; i<=5 ; i++)
		{
			System.out.println(s);
		}
		
		//Using 1 loops
		System.out.println("\nUsing 1 Loops technique :");
		for(int i=1 ; i<=25 ; i++)
		{
			System.out.print( (i-1)%5+1+" " );
			if( i%5 == 0 )System.out.println();
		}
		
		//Using 1 Loops with conditional Statement 
		System.out.println("\nUsing 1 Loops with conditional Statement");
		int a=1;
		for(int i=1 ; i<=5*5 ; i++)
		{
			System.out.print(a+" ");
			if(a==5)
			{
				System.out.println();
				a=0;
			}
			a++;
		}
	}
}