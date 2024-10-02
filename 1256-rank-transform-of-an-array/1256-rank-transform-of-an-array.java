class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int sorted[] = new int[arr.length];
        sorted = arr.clone();
        Arrays.sort(sorted);
        int rank = 1;
        Map<Integer, Integer> ranklist = new HashMap<>();
        for(int i = 0; i<sorted.length; i++)
        {
            ranklist.put(sorted[i], ranklist.getOrDefault(sorted[i], rank));
            rank++;
            if(i<sorted.length - 1 && sorted[i] == sorted[i+1] )
            {
                rank--;
            }
        }
        for(int i = 0; i<arr.length; i++)
        {
            sorted[i] = ranklist.get(arr[i]);
        }
        return sorted;
    }
}