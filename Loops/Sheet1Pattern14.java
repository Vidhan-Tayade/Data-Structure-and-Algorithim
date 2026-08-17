/*
   1 * * * *
   1 2 * * *
   1 2 3 * *
   1 2 3 4 *
   1 2 3 4 5
*/
class Sheet1Pattern14 {
	public static void main(String args[]) {
		
		//Using 2 Loops
		System.out.println("\nUsing 2 Loops :");
		for(int i=1 ; i<=5 ; i++ ) {
			for(int j=1 ; j<=5 ; j++) {
				if( i-j >= 0 )System.out.print(j+" ");
				else System.out.print("* ");
			}
			System.out.println();
		}

		
		//Using String with 1 Loops
		System.out.println("\nUsing String with 1 Loops :");
		StringBuffer str=new StringBuffer("");
	    for(int i=1 ; i<=5 ; i++) {
			System.out.print( str.append(i+" ") );
			for(int j=i+1 ; j<=5 ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//Using 1 Loops with Conditional Statement
		System.out.println("\nUsing 1 Loops with Conditional Statement :");
		int a=1;
		for(int i=1 ; i<=5 ; )
		{
			if( a<=i )System.out.print(a+" ");
			else System.out.print("* ");
			
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