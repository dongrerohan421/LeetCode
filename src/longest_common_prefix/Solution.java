package longest_common_prefix;

public class Solution {

    public String longestCommonPrefixHorizontal(String[] strs) {

        if (strs == null || strs.length == 0) {
            System.out.println("Empty String array");
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    System.out.println("Longest Common Prefix: " + prefix);
                    return "";
                }
            }
        }

        System.out.println("Longest Common Prefix: " + prefix);
        return prefix;
    }

    // Compare characters column by column
    public String longestCommonPrefixVertical(String[] strs) {
        if (strs == null || strs.length == 0 || strs[0].isEmpty()) {
            return "";
        }

        for (int column = 0; column < strs[0].length(); column++) {
            char current = strs[0].charAt(column);

            for (int row = 1; row < strs.length; row++) {
                if (column >= strs[row].length() || strs[row].charAt(column) != current) {
                    System.out.println("Longest Common Prefix: " + strs[0].substring(0, column));
                    return strs[0].substring(0, column);
                }
            }
        }

        System.out.println("Longest Common Prefix: " + strs[0]);
        return strs[0];
    }
}
