package top_two_numbers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class TopTwoNumbers {

    public static void main(String[] args) {
        TopTwoNumbers topTwoNumbers = new TopTwoNumbers();
        int[] num = {5,34,78,2,45,1,99,23};
        topTwoNumbers.TopTwoNumbers(num);

        String s ="Hello world";
        int len =6;
        topTwoNumbers.checkLength(s, len);
    }

    private void checkLength(String s, int len) {
        Predicate<String> predicate = str -> str.length() > len;
        System.out.println(predicate.test(s));
    }

    private void TopTwoNumbers(int[] num) {
        Arrays.stream(num).boxed().sorted(Comparator.reverseOrder()).limit(2).forEach(System.out::println);
    }


}
