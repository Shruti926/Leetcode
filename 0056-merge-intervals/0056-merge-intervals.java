class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][];
        
        // Sort intervals based on the start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        int[][] merge = new int[intervals.length][2];
        int x = 0;
        merge[x] = intervals[0];  // Start with the first interval
        
        for (int i = 1; i < intervals.length; i++) {
            // If current interval overlaps with the last merged interval
            if (intervals[i][0] <= merge[x][1]) {
                // Merge them by updating the end time to the maximum of both
                merge[x][1] = Math.max(merge[x][1], intervals[i][1]);
            } else {
                // No overlap, move to the next interval
                x++;
                merge[x] = intervals[i];
            }
        }
        
        // Copy the merged intervals to a correctly sized array
        return Arrays.copyOfRange(merge, 0, x + 1);
    }
}