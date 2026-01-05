class Solution {
    public int[] rearrangeArray(int[] nums) {
        int newArr[]=new int[nums.length];
        int i=0;
        int even=0,odd=1;
        while(i != nums.length)
        {
            if(nums[i] >= 0){
                newArr[even]=nums[i];
                even+=2;
            }
            else if(nums[i] < 0){
                newArr[odd]=nums[i];
                odd+=2;
            }
            i++; 
        }
        return newArr;
    }
}