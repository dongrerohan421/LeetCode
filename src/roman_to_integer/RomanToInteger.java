package roman_to_integer;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println("III: " + romanToInt("III"));
        System.out.println("LVIII: " + romanToInt("LVIII"));
        System.out.println("MCMXCIV: " + romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> hMap = new HashMap<>();
        hMap.put('I', 1);
        hMap.put('V', 5);
        hMap.put('X', 10);
        hMap.put('L', 50);
        hMap.put('C', 100);
        hMap.put('D', 500);
        hMap.put('M', 1000);

        int n = s.length();
        int res = 0;

        for (int i = 0; i < n - 1; i++) {
            if (hMap.get(s.charAt(i)) < hMap.get(s.charAt(i + 1))) {
                res -= hMap.get(s.charAt(i));
            } else {
                res += hMap.get(s.charAt(i));
            }
        }
        res += hMap.get(s.charAt(n - 1));

        return res;
    }
}
