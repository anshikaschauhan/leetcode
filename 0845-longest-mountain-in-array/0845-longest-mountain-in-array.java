class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int maxi = 0;

        int i = 1;

        while (i < n) {
            int peak = 1;

            // walk uphill
            while (i < n && arr[i] > arr[i - 1]) {
                i++;
                peak++;
            }

            // never went up → can't be a mountain from here
            if (peak == 1) {
                i++;
                continue;
            }

            int down = 1;

            // walk downhill
            while (i < n && arr[i] < arr[i - 1]) {
                i++;
                down++;
            }

            // went up but never came down (plateau / end of array)
            if (down == 1) {
                i++;
                continue;
            }

            // valid mountain: up + down, peak counted once
            maxi = Math.max(maxi, peak + down - 1);
            // i now sits at the valley = possible start of the next mountain
        }

        return maxi;
    }
}