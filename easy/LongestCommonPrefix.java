public class LongestCommonPrefix {

    /**
     * Write a function to find the longest common prefix string amongst an array of
     * strings.
     * If there is no common prefix, return an empty string "".
     */

    public static void main(String[] args) {

        String[] strs = { "a" };
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        Integer wordCount = 0;
        String word = strs[wordCount];

        if (strs == null || strs.length == 0 || strs[0].isEmpty()) {
            return "";
        }

        if (strs.length == 1) {
            return String.format("%s", strs[0].charAt(0));
        }

        for (Integer i = 1; i < strs.length - 1; i++) {
            for (Integer k = 0; k < 2; k++) {
                if (word.charAt(k) == strs[i].charAt(k)) {
                    if (word.charAt(k + 1) == strs[i].charAt(k + 1)) {
                        return String.format("%s%s", word.charAt(k), word.charAt(k + 1));
                    }
                } else {
                    wordCount++;
                }
            }
        }
        return "";
    }
}