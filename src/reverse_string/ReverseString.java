package reverse_string;

public class ReverseString {
    public static void main(String[] args) {
        char[] c = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(c);
    }

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
        System.out.println(s);
    }
}
