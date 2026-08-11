class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n-1,ans = -1;
      int first = firstoccurnace(nums,target,low,high,ans);
      int last = lastoccurance(nums,target,low,high,ans);
        return new int[]{first,last};
    }
    static int lastoccurance(int[] nums, int target,int low,int high,int ans){
        while(low <= high){
            int mid = low + (high - low) /2;
            if(nums[mid] == target){
                ans = mid;
                low = mid + 1;
            }else if(nums[mid] > target){
                high = mid - 1;
            } else low = mid + 1;
        }
    return ans;
  }
        static int firstoccurnace(int[] nums, int target,int low,int high,int ans){
            while(low <= high){
            int mid = low + (high - low) /2;
            if(nums[mid] == target){
                ans = mid;
                high = mid - 1;
            }else if(nums[mid] > target){
                high = mid - 1;
            } else low = mid + 1;
        }
    return ans;
    }
}
