class Solution {
    public int compress(char[] chars) {
        String str = new String(chars);
        StringBuilder sb =  new StringBuilder("");
        for(int i = 0; i<str.length(); i++)
        {
            Integer count = 1;
            while((i < str.length() - 1) && (str.charAt(i) == str.charAt(i+1)))
            {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1)
            {
                sb.append(count.toString());
            }
        }
        str = sb.toString();
        char charArray[] = str.toCharArray();
        System.arraycopy(charArray, 0, chars, 0, charArray.length);
        return charArray.length;
    }
}