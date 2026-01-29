/*
  1
  1 2
  1 2 3
  1 2 3 4
  1 2 3 4 5
*/
class Sheet1Pattern4 {
	public static void main(String args[]) {
		
		//Using 2 Loops
		System.out.println("\nUsing 2 Loops :");
		for(int i=1 ; i<=5 ; i++) {
			for(int j=1 ; j<=i ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

        //Using String with 1 Loops
		System.out.println("\nUsing String with 1 Loops :");
		String s="12345";
		int len=s.length();
		for(int i=0 ; i<=len ; i++) {
			System.out.println( s.substring( 0,i ) );
		}
		
		//Using 1 Loops with Conditional Statement
		System.out.println("\nUsing 1 Loops with Conditional Statement :");
		int a=1;
		for(int i=1 ; i<=5 ; ) {
			System.out.print(a+" ");
			if( a == i )
			{
				System.out.println();
				a=0;
				i++;
			}
			a++;
		}
	}
}