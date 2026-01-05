class Solution {
    public int reverse(int x) {
        int n=x;
        int s=0;

        while(n!=0)
        {
            int a=n%10;
             
            if(s > Integer.MAX_VALUE/10 || s == Integer.MAX_VALUE/10 && a > 7)return 0;
            if(s < Integer.MIN_VALUE/10 || s == Integer.MIN_VALUE/10 && a < -8)return 0;

            s=s*10+a;
            n=n/10;
        }
        return s;
    }
}