/**
 * Created by henry on 2021/1/13.
 */
public class ImplementTrie_PrefixTree_208 {
    class TrieNode {
        public boolean isWord;
        TrieNode[] children = new TrieNode[26];
        public TrieNode(){}
    }

    class Trie {
        private TrieNode root;
        /** Initialize your data structure here. */
        public Trie() {
            root = new TrieNode();
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            TrieNode temp = root;
            for(int i = 0; i<word.length(); i++){
                char c = word.charAt(i);
                if(temp.children[c - 'a'] == null){
                    temp.children[c - 'a']  = new TrieNode();
                }
                temp = temp.children[c - 'a'];
            }
            temp.isWord = true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            TrieNode temp = root;
            for(int i = 0; i < word.length(); i++){
                char c = word.charAt(i);
                if(temp.children[c - 'a'] == null) return false;
                temp = temp.children[c - 'a'];
            }
            return temp.isWord;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            TrieNode temp = root;
            for(int i = 0; i < prefix.length(); i++){
                char c = prefix.charAt(i);
                if(temp.children[c - 'a'] == null) return false;
                temp = temp.children[c - 'a'];
            }
            return true;
        }
    }

}
