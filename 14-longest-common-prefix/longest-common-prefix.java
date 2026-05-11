class Solution {
    public String longestCommonPrefix(String[] strs) {
         StringBuilder longestPrefix = new StringBuilder();

        int strMinLength = strs[0].length();
        for (String str : strs) {
            if (str.length() < strMinLength) {
                strMinLength = str.length();
            }
        }

        for (int i = 0; i < strMinLength; i++) {
            char c = strs[0].charAt(i);

            for (String str : strs) {
                if (str.charAt(i) != c) {
                    return longestPrefix.toString();
                }
            }
            longestPrefix.append(c);
        }
        return longestPrefix.toString();

    }
}