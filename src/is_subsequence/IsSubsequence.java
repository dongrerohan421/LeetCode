package is_subsequence;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("acb", "ahbgdc"));
        System.out.println(isSubsequence("axe", "ahbgdc"));
        System.out.println(isSubsequence("axegc", "ahbgdc"));
        System.out.println(isSubsequence("", "ahbgdc"));
    }

    private static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }

        for (int i = 0, pointer = 0; i < t.length(); i++) {
            if (s.charAt(pointer) == t.charAt(i)) {
                pointer++;
                if (pointer == s.length()) {
                    return true;
                }
            }
        }

        return false;
    }
}
