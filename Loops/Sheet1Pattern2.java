/*
  1 2 3 4 5
  1 2 3 4 
  1 2 3 
  1 2   
  1   
*/
class Sheet1Pattern2
{
	public static void main(String args[])
	{
		//Using 2 Loops
		System.out.println("\nUsing 2 Loops");
		for( int i=5 ; i>=1 ; i-- )
		{
			for( int j=1 ; j<=i ; j++ )
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//Using String and 1 loop
		System.out.println("\nUsing String and 1 Loops");
		String s="1 2 3 4 5 ";
		for( int i=5 ; i>=1 ; i--)
		{
			System.out.println(s.substring(0,i*2-1));
		}
		
		//Using 1 loop with Conditional Statement
		System.out.println("\nUsing 1 Loops with Conditional Statement");
		int a=1;
		for(int i=1 ; i<=3*5 ; i++)
		{
			System.out.print(a+" ");
			if( a==5 )
			{
				
			}
			a++;
		}
	}
}
