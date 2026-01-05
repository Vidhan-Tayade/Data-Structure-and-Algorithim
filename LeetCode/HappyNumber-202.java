import java.util.HashSet;
import java.util.Set;

class Solution {
    public static int sumOfSquare(int n)
    {
        int a,sum=0;
        while(n!=0)
        {
            a=n%10;
            sum=sum+(a*a);
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {

        Set<Integer> set=new HashSet<>();

        while( n!=1 && !set.contains(n))
        {
            set.add(n);
            n=sumOfSquare(n);
        }
        return n==1;
        
    }
}