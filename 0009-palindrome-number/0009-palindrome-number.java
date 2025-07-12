class Solution {
    public boolean isPalindrome(int x) {
     if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            
            // تحقق من عدم حدوث overflow
            if (reversed > Integer.MAX_VALUE / 10) {
                return false;
            }

            reversed = reversed * 10 + digit;
            x /= 10;
        }

        // إذا كان العدد المعكوس يساوي الأصلي → Palindrome
        return reversed == original;    
    }
}