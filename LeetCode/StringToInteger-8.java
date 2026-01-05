class Solution {
    public int myAtoi(String s) {
        if(s == null)return 0;
        String str=s.trim();
        if(str.length() == 0)return 0;
        int i=0;
        int sign=1;
        if(str.charAt(i) == '-' || str.charAt(i) == '+') 
        {
            sign=(str.charAt(i)=='-')?-1:1;
            i++;
        }
        int num=0;
        while(i < str.length() && Character.isDigit(str.charAt(i)))
        {
                int digit=str.charAt(i)-'0';
                if(num > Integer.MAX_VALUE/10 || (num == Integer.MAX_VALUE/10 && digit > 7))
                {   return (sign==-1)?Integer.MIN_VALUE:Integer.MAX_VALUE;  }

                num=num*10+digit;
            i++;
        }
       
        return sign*num;
    }
}