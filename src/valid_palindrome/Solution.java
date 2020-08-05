package valid_palindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        return new StringBuilder(s).reverse().toString().equalsIgnoreCase(s);
    }
}