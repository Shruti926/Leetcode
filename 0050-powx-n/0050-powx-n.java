class Solution {
    public double calcpower(double x, int n)
    {
        if(n == 0)
        {
            return 1;
        }
        double half = calcpower(x, n / 2); // Recursive step: calculate half power.
        if (n % 2 == 0) {
            return half * half; // If n is even.
        } else {
            return half * half * x; // If n is odd.
        }
    }
    public double myPow(double x, int n) {
        if (n<0)
        {
            n= n*-1;
            return 1/calcpower(x,n);

        }
        double power = calcpower(x,n);
        return power;        
    }
}