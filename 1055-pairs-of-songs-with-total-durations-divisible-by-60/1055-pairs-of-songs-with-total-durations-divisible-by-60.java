class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] remainderCounts = new int[60]; // Array to store counts of remainders
        int count = 0;

        for (int t : time) {
            int remainder = t % 60; // Compute remainder for the current time

            // Find the complement remainder that would make (remainder + complement) divisible by 60
            int complement = (60 - remainder) % 60;

            // Add to the count the number of times the complement has occurred
            count += remainderCounts[complement];

            // Increment the count of this remainder for future pairs
            remainderCounts[remainder]++;
        }

        return count;
    }
}
