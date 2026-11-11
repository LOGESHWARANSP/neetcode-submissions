public class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        long[] prefixSum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        int res = 1;
        for (int i = 0; i < n; i++) {
            int left = 0, right = i;
            while (left <= right) {
                int mid = (left + right) / 2;
                long curSum = prefixSum[i + 1] - prefixSum[mid];
                long need = (i - mid + 1) * 1L * nums[i] - curSum;
                if (need <= k) {
                    right = mid - 1;
                    res = Math.max(res, i - mid + 1);
                } else {
                    left = mid + 1;
                }
            }
        }
        return res;
    }
}
