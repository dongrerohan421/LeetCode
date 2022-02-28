package length_of_lastword;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println("LastWord: " + lengthOfLastWord("Hello World")); // World: 5
        System.out.println("LastWord: " + lengthOfLastWord("   fly me   to   the moon  ")); // moon: 4
        System.out.println("LastWord: " + lengthOfLastWord("luffy is still joyboy")); // joyboy: 6
    }

    public static int lengthOfLastWord(String s) {
        int count = 0;
        int lastCount = 0;
        char[] c = s.toCharArray();
        if (!s.isBlank()) {
            for (int i = 0; i < s.length(); i++) {
                if (Character.isSpaceChar(c[i])) {
                    count = 0;
                } else {
                    count++;
                    lastCount = count;
                }
            }
        }
        return lastCount;
    }
}
