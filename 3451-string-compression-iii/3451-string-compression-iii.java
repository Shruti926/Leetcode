class Solution {
    public String compressedString(String word) {
        StringBuilder sb  = new StringBuilder("");
        for(int i = 0; i<word.length(); i++)
        {
            Integer count = 1;
            while((i<word.length()-1) && (word.charAt(i) == word.charAt(i+1)))
            {
                count++;
                i++;
                if(count == 9)
                {
                    sb.append(count.toString());
                    sb.append(word.charAt(i));
                    count = 0;
                }
            }
            if(count>0)
            {
                sb.append(count.toString());
                sb.append(word.charAt(i));
            }
        }
        String comp = sb.toString();
        return comp;
    }
}