class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        } else {
            if (s.equals(goal)) { // Use .equals for string comparison
                return true;
            }
        }
        String rotated = s;

        for(int i = 0; i<s.length(); i++)
        {
            if(rotated.equals(goal))
            {
                return true;
            }
            rotated = rotated.substring(1, rotated.length()) + rotated.charAt(0);
        }
        return false;
    }
}
