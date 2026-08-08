class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int pos = 0;
        int neg = 1;
       for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                // Place negative number at odd index
                result[neg] = nums[i];
                neg += 2;
            } else {
                // Place positive number at even index
                result[pos] = nums[i];
                pos += 2;
            }
        }

        return result;
    }
}
