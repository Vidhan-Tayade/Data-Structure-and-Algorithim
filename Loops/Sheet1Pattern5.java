/*
  1
  2 1
  3 2 1
  4 3 2 1
  5 4 3 2 1
*/
class Sheet1Pattern5 {
	public static void main(String args[]) {
		
		//Using 2 Loops
		System.out.println("\nUsing 2 Loops :");
		for(int i=1 ; i<=5 ; i++) {
			for(int j=i ; j>=1 ; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

        //Using String with 1 Loops
		System.out.println("\nUsing String with 1 Loops :");
		String s="54321";
		int len=s.length();
		for(int i=len ; i>=1 ; i--) {
			System.out.println( s.substring( i-1,len ) );
		}
		
		//Using 1 Loops with Conditional Statement
		System.out.println("\nUsing 1 Loops with Conditional Statement :");
		int a=1;
		for(int i=1 ; i<=5 ; ) {
			System.out.print(a+" ");
			if( a == 1 )
			{
				System.out.println();
				a= ++i + 1;
			}
			a--;
		}
	}
}