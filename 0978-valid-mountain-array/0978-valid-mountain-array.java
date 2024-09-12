class Solution {
    public boolean validMountainArray(int[] arr) {
        // Length must be at least 3 for a valid mountain array
        if (arr.length < 3) {
            return false;
        }

        int i = 0;
        int n = arr.length;

        // Climb up: strictly increasing part
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        // Peak can't be the first or last element
        if (i == 0 || i == n - 1) {
            return false;
        }

        // Climb down: strictly decreasing part
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        // Return true if we've reached the end of the array
        return i == n - 1;
    }
}
