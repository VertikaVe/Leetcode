class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int current_sum =0;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i<n;i++){
        current_sum += nums[i];
        if(current_sum > maxi){
           maxi = current_sum;
        }
        if(current_sum<0){
            current_sum= 0;
        }
        }  
        return maxi;  
        
    }
}