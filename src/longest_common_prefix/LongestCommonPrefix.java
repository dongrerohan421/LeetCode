package longest_common_prefix;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        Solution solution = new Solution();

        String strs[] = {"flower","flow","flight"};
        solution.longestCommonPrefixHorizontal(strs);
        solution.longestCommonPrefixVertical(strs);

        String strs1[] = {"dog","racecar","car"};
        solution.longestCommonPrefixHorizontal(strs1);
    }
}