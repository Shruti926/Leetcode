class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int num = 0;
        int prev_value = 0;
        for(int  i = s.length()-1; i>=0; i--)
        {
            int curr_value = map.get(s.charAt(i));
            if(curr_value < prev_value)
            {
                num-=curr_value;
            }
            else{
                num+=curr_value;
            }
            prev_value = curr_value;
        }
        return num;
    }
}