package add_and_search_word;

import java.util.ArrayList;
import java.util.List;

public class WordDictionary {
    List<String> list;

    /** Initialize your data structure here. */
    public WordDictionary() {
        list = new ArrayList<>();
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        list.add(word);
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot
     * character '.' to represent any one letter.
     */
    public boolean search(String word) {
        return list.contains(word);
    }
}