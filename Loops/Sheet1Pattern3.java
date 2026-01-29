/*
  1 2 3 4 5
  2 3 4 5
  3 4 5
  4 5
  5
*/
class Sheet1Pattern3 {
	public static void main(String args[]) {
		
		
		//Using 2 Loops
		System.out.println("\nUsing 2 Loops :");
		for(int i=1 ; i<=5 ; i++) {
			for(int j=i ; j<=5 ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

        //Using String with 1 Loops
		System.out.println("\nUsing String with 1 Loops :");
		String s="12345";
		int len=s.length();
		for(int i=0 ; i<len ; i++) {
			System.out.println( s.substring( i,len ) );
		}
		
		//Using 1 Loops with Conditional Statement
		System.out.println("\nUsing 1 Loops with Conditional Statement :");
		int a=1,b=5;
		for(int i=1 ; i<=5 ; ) {
			System.out.print(a+" ");
			if( a == b )
			{
				System.out.println();
				a=i++;
			}
			a++;
		}
	}
}
