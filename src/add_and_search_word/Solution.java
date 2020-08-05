package add_and_search_word;

public class Solution {
    public static void main(String[] args) {
        WordDictionary wordDictionary = new WordDictionary();

        // "search","search","search","search"
        wordDictionary.addWord("WordDictionary");
        wordDictionary.addWord("addWord");
        wordDictionary.addWord("search");

        wordDictionary.search("WordDictionary");
        wordDictionary.search("addWord");
        wordDictionary.search("search");
    }
}