class Solution {
    public int maxArea(int[] height) {
        int start = 0, end = height.length-1;
        int max = 0;

        while(start < end){
            int minheight = Math.min(height[start], height[end]);
            int width = end - start;

            int area = minheight * width;
            max = Math.max(max, area);

            if(height[start] <= height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return max; 
    }
}