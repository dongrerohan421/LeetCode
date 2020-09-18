package compress;

/* compress("a") = "a"
/* compress("aaa") = "a3"
/* compress("aaabbb") = "a3b3"
/* compress("aaabbba") = "a3b3a"
/* compress("aaabbccca") = "a3b2c3a1"
 */
public class Compress {

    public static void main(String[] args) {
        compress("a");
        compress("aaa");
        compress("aaabbb");
        compress("aaabbccc");
        compress("aaabbccca");
    }

    public static String compress(String string) {
        if (string.isEmpty()) {
            return "";
        }

        char[] chars = string.toCharArray();
        StringBuilder builder = new StringBuilder();

        int count = 1;
        char prev = chars[0];
        for (int i = 1; i < chars.length; i++) {
            char current = chars[i];
            if (current == prev) {
                count++;
            } else {
                builder.append(prev).append(count);
                count = 1;
            }
            prev = current;
        }
        System.out.println(builder.append(prev).append(count).toString());
        return builder.append(prev).append(count).toString();
    }
}
