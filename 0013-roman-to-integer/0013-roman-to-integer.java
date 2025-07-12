class Solution {
    public int romanToInt(String s) {
     Map<Character, Integer> val = new HashMap<>();
        val.put('I', 1);
        val.put('V', 5);
        val.put('X', 10);
        val.put('L', 50);
        val.put('C', 100);
        val.put('D', 500);
        val.put('M', 1000);

        int total = 0;

        // 2. Scan the string from left to right.
        for (int i = 0; i < s.length(); i++) {
            int curr = val.get(s.charAt(i));

            /* 3. Look‑ahead:
                 ‑ If the current value is smaller than the next value,
                   it must be a subtractive pair (e.g. IV, IX, XL, etc.),
                   so subtract it from the total.
                 ‑ Otherwise add it. */
            if (i + 1 < s.length() && curr < val.get(s.charAt(i + 1))) {
                total -= curr;
            } else {
                total += curr;
            }
        }

        return total;   
    }
}