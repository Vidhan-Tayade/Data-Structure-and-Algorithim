/*
  6
  1 6
  1 2 6
  1 2 3 6
  1 2 3 4 6 
  1 2 3 4 5 6
*/
class Sheet1Pattern10 {
	public static void main(String args[]) {
		
		//Using 2 Loops
		System.out.println("\nUsing 2 Loops :");
		for(int i=0 ; i<=5 ; i++) {
			for(int j=1 ; j<=i ; j++) {
				System.out.print(j+" ");
			}
			System.out.print(6+"\n");
		}
		
		
		//Using String with 1 Loops
		System.out.println("\nUsing String with 1 Loops :");
		String s="12345";
		for(int i=1 ; i<=5 ; i++) {
			System.out.print("6\n");
			System.out.print(s.substring(0,i) );
		}
		System.out.print("6\n");
		
		
		
		//Using 1 Loops with Conditional Statement
		System.out.println("\nUsing 1 Loops with Conditional Statement :");
		int a=1;
		System.out.print("6\n");
		for(int i=1 ; i<=5 ; )
		{
			System.out.print(a+" ");
			if( a==i )
			{
				System.out.print(6+"\n");
				a=0;
				i++;
			}
			a++;
		}
		
	}
}