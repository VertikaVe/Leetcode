
        class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        n=n+1;
        int k = range(nums,0,n);
         return k;
        }
        public static int range(int[] nums ,int a,int n){
            int sum =0;
            int sum1 = 0;
            for(int i = 0; i< nums.length;i++){
                sum = sum + nums[i];
            }for(int i = 0; i<n;i++){
                sum1 =sum1 + i;
            }
            int x = sum1 - sum;
            return x;
        }
       
    }

    