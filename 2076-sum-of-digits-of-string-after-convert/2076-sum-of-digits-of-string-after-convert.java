class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++)
        {
            sb.append(s.charAt(i) - 'a' + 1);
            //int a  = s.charAt(i) - 'a'+1;(shows difference b/w position of both characters)
        }
        String result = sb.toString();
        for(int j = 0; j<k; j++)
        {
            Integer sum = 0;
            for(int i = 0; i<result.length(); i++)
            {
                sum += Character.getNumericValue(result.charAt(i));
            }
            result = Integer.toString(sum);
        }
        return Integer.parseInt(result);
    }
}