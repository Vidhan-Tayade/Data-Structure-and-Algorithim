/*
  *
  * *
  * * *
  * * * *
  * * * * *
*/
class Sheet1Pattern13 {
	public static void main(String args[]) {
		
		//Using 2 Loops
		System.out.println("\nUsing 2 Loops :");
		for(int i=1 ; i<=5 ; i++) {
			for(int j=1 ; j<=i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		//Using String with 1 Loops
		System.out.println("\nUsing String with 1 Loops :");
		StringBuffer str=new StringBuffer("*");
		for(int i=1 ; i<=5 ; i++) {
			System.out.println(str);
			str.append(" *");
		}
		
		//Using 1 Loops with Conditional Statement
		System.out.println("\nUsing 1 Loops with Conditional Statement :");
		int i=1,a=1;
		while( i<=5 )
		{
			System.out.print("* ");
			if( a==i )
			{
				System.out.println();
				a=0;
				i++;
			}
			a++;
		}
		
	}
}