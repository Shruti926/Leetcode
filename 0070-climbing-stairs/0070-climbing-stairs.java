class Solution {
    static HashMap<Integer, Integer> memo = new HashMap<>();
    public int climbStairs(int n) {
        if(n ==1 || n == 0)
        {
            return 1;
        } 
        if(memo.containsKey(n))
        {
            return memo.get(n);
        }
        int steps = climbStairs(n-1)+climbStairs(n-2);
        memo.put(n, steps);
        return steps;
    }
}