class Solution {
    public boolean isAnagram(String s, String t) {
        boolean ans = true;
        if(s.length() != t.length()){
            return false;
        }
        
        else{
            HashMap<Character, Integer> s1 = new HashMap<>();
            for(int i = 0; i<s.length(); i++){
                char c = s.charAt(i);
                s1.put(c, s1.getOrDefault(c, 0)+1 );
            }
            HashMap<Character, Integer> t1 = new HashMap<>();
            for(int i = 0; i<t.length(); i++){
                char c = t.charAt(i);
                t1.put(c, t1.getOrDefault(c, 0)+1);
            }

            ans = s1.equals(t1);
        }
        return ans;
    }
}