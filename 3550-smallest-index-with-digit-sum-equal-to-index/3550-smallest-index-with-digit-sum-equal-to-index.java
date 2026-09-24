class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            if (sum(nums[i], i)) {
                return i;
            }
        }
        return -1;
    }
    private boolean sum(int num, int i) {
        int temp= Math.abs(num);
        int sum= 0;
        while(temp>0) {
            sum+= temp % 10;
            temp/= 10;
        }
        return sum==i;
    }
}