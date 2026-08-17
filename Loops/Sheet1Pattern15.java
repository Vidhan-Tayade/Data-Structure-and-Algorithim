/*
  1
  1 0
  1 0 1
  1 0 1 0
  1 0 1 0 1
*/
class Sheet1Pattern15 {
	public static void main(String args[]) {
		
		//Using 2 Loops
		System.out.println("\nUsing 2 Loops :");
		for(int i=1 ; i<=5 ; i++ ) {
			for(int j=1 ; j<=i ; j++) {
				System.out.print( j%2+" " );
			}
			System.out.println();
		}
		
		
		//Using String with 1 Loops
		System.out.println("\nUsing String with 1 Loops :");
		StringBuffer str=new StringBuffer("");
		for(int i=1 ; i<=5 ; i++) {
			if( i%2==1 )System.out.println( str.append("1 ") );
			else System.out.println( str.append("0 ") );
		}
		
		//Using 1 Loops with Conditional Statement
		System.out.println("\nUsing 1 Loops with Conditional Statement :");
		int i=1, a=1;
		while( i<=5 )
		{
			if( a%2==1 )System.out.print(1+" ");
			else System.out.print(0+" ");
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