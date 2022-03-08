package maximum_number_of_words_found_in_sentences;

public class MaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {
        String[] sentences = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
        mostWordsFound(sentences); // output: 6
        mostWordsFound2(sentences); // output: 6
        String[] sentences2 = { "please wait", "continue to fight", "continue to win" };
        mostWordsFound(sentences2); // output: 3
        mostWordsFound2(sentences2); // output: 3
    }

    // Time Complexity : O(n*m), Runtime: 2 ms, Memory Usage: 43.8 MB
    private static int mostWordsFound(String[] sentences) {
        int maxCount = Integer.MIN_VALUE;

        for (int i = 0; i < sentences.length; i++) {
            int count = 1;
            char[] c = sentences[i].toCharArray();
            for (int j = 0; j < c.length; j++) {
                if (c[j] == ' ') {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }

    // split method in java returns array of strings
    // Time Complexity : O(n), Runtime: 9 ms, Memory Usage: 46 MB
    private static int mostWordsFound2(String[] sentences) {
        int maxCount = 0;

        for (int i = 0; i < sentences.length; i++) { // traversing the sentences array
            String s = sentences[i]; // take out ith String
            String[] a = s.split(" "); // Split it into String array
            maxCount = Math.max(maxCount, a.length); // find maximum length in all arrays
        }
        return maxCount;
    }
}
