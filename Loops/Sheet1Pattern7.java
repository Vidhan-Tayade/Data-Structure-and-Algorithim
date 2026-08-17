/*
  5 4 3 2 1
  5 4 3 2 
  5 4 3 
  5 4 
  5 
*/
class Sheet1Pattern7 {
	public static void main(String args[]) {
		
		//Using 2 Loops
		System.out.println("\nUsing 2 Loops :");
		for(int i=1 ; i<=5 ; i++) {
			for(int j=5 ; j>=i ; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//Using String with 1 Loops
		System.out.println("\nUsing String with 1 Loops :");
		String s="54321";
		int len=s.length();
		for(int i=1 ; i<=5 ; i++) {
			System.out.println(s.substring(0,len-(i-1)));
		}
		
		//Using 1 Loops with Conditional Statement
		System.out.println("\nUsing 1 Loops with Conditional Statement :");
		int a=5;
		for(int i=1 ; i<=5 ; )
		{
			System.out.print(a+" ");
			if( a==i )
			{
				System.out.println();
				a=6;
				i++;
			}
			a--;
		}
		
	}
}