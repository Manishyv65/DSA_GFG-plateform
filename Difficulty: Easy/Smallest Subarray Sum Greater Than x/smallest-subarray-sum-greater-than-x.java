class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {

        int left = 0;
        int sum = 0;
        int minLen = arr.length + 1;

        for (int right = 0; right < arr.length; right++) {

            // Add current element
            sum += arr[right];

            // Shrink window while sum > x
            while (sum > x) {

                int len = right - left + 1;

                minLen = Math.min(minLen, len);

                // Remove left element
                sum -= arr[left];
                left++;
            }
        }

        // No valid subarray found
        if (minLen == arr.length + 1) {
            return 0;
        }

        return minLen;
    }
}