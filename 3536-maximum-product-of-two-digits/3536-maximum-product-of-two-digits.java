class Solution {
    public int maxProduct(int n) {
        int max1 = 0;
        int max2 = 0;

        while (n !=  0 ){
            int val = n%10;
            
            if(val > Math.min(max1, max2)){
                if(max1 >= max2){
                    max2 = val;
                }
                else{
                    max1 = val;
                }
            }

            n/=10;
        }
        return max1*max2;
    }
}