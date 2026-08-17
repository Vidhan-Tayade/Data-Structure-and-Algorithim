/*
   2 3 4 5 6
   3 4 5 6 7
   4 5 6 7 8 
   5 6 7 8 9
   6 7 8 9 10
*/
class Sheet1Pattern11 {
	public static void main(String args[]) {
		
		//Using 2 Loops
		System.out.println("\nUsing 2 Loops :");
		for(int i=1 ; i<=5 ; i++) {
			for(int j=1 ; j<=5 ; j++) {
				System.out.print(i+j+" ");
			}	
			System.out.println();
		}
		
		
		//Using Array with 1 Loops
		System.out.println("\nUsing String with 1 Loops :");
		int nums[]={1,2,3,4,5};
		int inc=6;
		for(int i=1 ; i<=5 ; i++) {
			for(int j:nums) {
				System.out.print( (j+i)+" ");
			}
			System.out.println();
		}
		
		//Using 1 Loops with Conditional Statement
		System.out.println("\nUsing 1 Loops with Conditional Statement :");
		int i=1,a=i,n=5;
		while( i<=n )
		{
			System.out.print( (a=a+1)+" ");
			if( a==i+n )
			{
				System.out.println();
				a=i+1;
				i++;
			}
		}
		
	}
}