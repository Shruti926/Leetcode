class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        if(x<0)
        {
            return false;
        }
        char []arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while(left < right)
        {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String str_r = new String(arr);
        
            try{
                int num_r = Integer.parseInt(str_r);
                if(x == num_r)
        {
            return true;
        }
        }
        catch(NumberFormatException e)
        {return false; }
        return false;
        }
        
    }
