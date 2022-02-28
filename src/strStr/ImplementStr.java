package strStr;

public class ImplementStr {
    public static void main(String[] args) {
        System.out.println("Index of the needle in haystack: " + strStr("hello", "ll"));
        System.out.println("Index of the needle in haystack: " + strStr("aaaaa", "bba"));
        System.out.println("Index of the needle in haystack: " + strStr("", ""));
    }

    private static int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)) {
            return -1;
        }
        return haystack.indexOf(needle);
    }
}
