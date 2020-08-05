package valid_palindrome;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Solution {
    public boolean isPalindrome(String s) {
        return new StringBuilder(s).reverse().toString().equalsIgnoreCase(s);
    }
}