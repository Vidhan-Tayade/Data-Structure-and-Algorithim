/*
  5
  4 5
  3 4 5
  2 3 4 5
  1 2 3 4 5  
*/
class Sheet1Pattern9 {
	public static void main(String args[]) {
		
		//Using 2 Loops
		System.out.println("\nUsing 2 Loops :");
		for(int i=5 ; i>=1 ; i--) {
			for(int j=i ; j<=5 ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//Using String with 1 Loops
		System.out.println("\nUsing String with 1 Loops :");
		String s="12345";
		int len=s.length();
		for(int i=1 ; i<=5 ; i++) {
			System.out.println(s.substring(len-i,len));
		}
		
		//Using 1 Loops with Conditional Statement
		System.out.println("\nUsing 1 Loops with Conditional Statement :");
		int a=5;
		for(int i=5 ; i>=1 ; )
		{
			System.out.print(a+" ");
			if( a==5 )
			{
				System.out.println();
				a=i-2;
				i--;
			}
			a++;
		}
		
	}
}