/**
 * Created by henry on 2021/1/14.
 */
public class DesignAddandSearchWordsDataStructure_211 {
    class TrieNode {
        public boolean isWord;
        TrieNode[] children = new TrieNode[26];
        public TrieNode(){}
    }

    class WordDictionary {
        private TrieNode root;
        /** Initialize your data structure here. */
        public WordDictionary() {
            root = new TrieNode();
        }

        /** Adds a word into the data structure. */
        public void addWord(String word) {
            TrieNode temp = root;
            for(int i = 0; i < word.length(); i++){
                char c = word.charAt(i);
                if(temp.children[c - 'a'] == null){
                    temp.children[c - 'a'] = new TrieNode();
                }
                temp = temp.children[c - 'a'];
            }
            temp.isWord = true;
        }

        /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
        public boolean search(String word) {
            return searchSubWord(word, 0, root);
        }

        private boolean searchSubWord(String word, int curIdx, TrieNode curNode){
            if(curIdx == word.length()) return curNode.isWord;
            char c = word.charAt(curIdx);
            if(c == '.'){
                for(TrieNode node : curNode.children){
                    if(node != null && searchSubWord(word, curIdx + 1, node)){
                         return true;
                    }
                }
            }else{
                if(curNode.children[c - 'a'] == null) return false;
                return searchSubWord(word, curIdx + 1, curNode.children[c - 'a']);
            }
            return false;
        }
    }

}
