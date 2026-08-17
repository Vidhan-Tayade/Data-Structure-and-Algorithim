/*
  * * * * *
  * * * * *
  * * * * *
  * * * * *
  * * * * *
*/
class Sheet1Pattern12 {
	public static void main(String args[]) {
		
		//Using 2 Loops
		System.out.println("\nUsing 2 Loops :");
		for(int i=1 ; i<=5 ; i++) {
			for(int j=1 ; j<=5 ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		//Using String with 1 Loops
		System.out.println("\nUsing String with 1 Loops :");
		String s="* * * * *";
		for(int i=1 ; i<=5 ; i++ ) {
			System.out.println(s);
		}
			
		//Using 1 Loops with Conditional Statement
		System.out.println("\nUsing 1 Loops with Conditional Statement :");
		int i=1, a=1;
		while( i<=5 )
		{
			System.out.print("* ");
			if( a==5 )
			{
				System.out.println();
				a=0;
				i++;
			}
			a++;
		}
		
	}
}