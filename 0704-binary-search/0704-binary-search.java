class Solution {
    public int search(int[] nums, int target) {
       int n = nums.length; 
       int low = 0;
       int high = n-1;
      return recursive(nums,low,high,target);
         }
public static int recursive(int[] nums,int low,int high,int target){
        if(low > high){
            return -1;
        }
        int mid = (low + high) / 2;
        if(target == nums[mid]){
            return mid;
        }else if(target > nums[mid]){
            return recursive(nums,mid +1,high,target);
        } return recursive(nums,low,mid - 1,target);
    }
}
