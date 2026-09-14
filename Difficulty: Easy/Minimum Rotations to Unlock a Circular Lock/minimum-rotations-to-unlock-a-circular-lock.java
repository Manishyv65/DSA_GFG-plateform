class Solution {
    static int rotationCount(int r, int d)
        {
            int res = 0;

            while (r > 0 || d > 0) {

                // Add the minimum rotations needed for the
                // current digit.
                int diff = Math.abs((r % 10) - (d % 10));
                res += Math.min(diff, 10 - diff);
                r /= 10;
                d /= 10;
            }

            return res;
        }
    
}
        