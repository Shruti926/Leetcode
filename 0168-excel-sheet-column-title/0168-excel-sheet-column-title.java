class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            // Adjust columnNumber by subtracting 1 to map it correctly in the alphabet (A -> 1, but we need A -> 0).
            columnNumber--;
            // Find the remainder and convert it to the corresponding character
            char currentChar = (char) ('A' + (columnNumber % 26));
            // Append to the result (build in reverse order)
            sb.append(currentChar);
            // Move to the next digit
            columnNumber /= 26;
        }
        
        // Reverse the result since we build the string backwards
        return sb.reverse().toString();
    }
}
