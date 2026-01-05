class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int distance=0,width=0;
        int min=0;
        while(left < right)
        {
            distance = right - left;

            if(height[right] < height[left])
                min = height[right--];
            else
                min= height[left++];

            width = (width < (min*distance))?(min*distance):width;
        }
        return width;
        
    }
}