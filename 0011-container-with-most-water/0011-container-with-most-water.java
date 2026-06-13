class Solution {
    public int maxArea(int[] height) {
        int maxwater= 0;
        int left=0;
        int right= height.length-1;
        while(left<right){
            int width= Math.abs(right-left);
            int h= Math.min(height[left], height[right]);
            int area= h * width;
            if(area>maxwater){
                maxwater= area;
            }
            if(height[left]>height[right])  right--;
            else left++;
        }
        return maxwater;
    }
}