// Design a data structure that supports adding new words and finding if a string matches any previously added string.

// Implement the WordDictionary class:

// WordDictionary() Initializes the object.
// void addWord(word) Adds word to the data structure, it can be matched later.
// bool search(word) Returns true if there is any string in the data structure that matches word or false otherwise. word may contain dots '.' where dots can be matched with any letter.


// Example:

// Input
// ["WordDictionary","addWord","addWord","addWord","search","search","search","search"]
// [[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]
// Output
// [null,null,null,null,false,true,true,true]

// Explanation
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("bad");
// wordDictionary.addWord("dad");
// wordDictionary.addWord("mad");
// wordDictionary.search("pad"); // return False
// wordDictionary.search("bad"); // return True
// wordDictionary.search(".ad"); // return True
// wordDictionary.search("b.."); // return True


// Constraints:

// 1 <= word.length <= 25
// word in addWord consists of lowercase English letters.
// word in search consist of '.' or lowercase English letters.
// There will be at most 3 dots in word for search queries.
// At most 104 calls will be made to addWord and search.
// Accepted
// 447,282
// Submissions
// 1,035,481

public Solution {
    // class TrieNode {
    //     TrieNode[] children;
    //     boolean isWord;
    //     public TrieNode() {
    //         children = new TrieNode[26];
    //         isWord = false;
    //     }
    // }
    // TrieNode root;
    // public WordDictionary() {
    //     root = new TrieNode();
    // }

    // public void addWord(String word) {
    //     TrieNode curr = root;
    //     for(char c : word.toCharArray()) {
    //         if(curr.children[c - 'a'] == null) {
    //             curr.children[c - 'a'] = new TrieNode();
    //         }
    //         curr = curr.children[c - 'a'];
    //     }
    //     curr.isWord = true;
    // }

    // public boolean search(String word) {
    //     return dfs(word, root, 0);
    // }

    // private boolean dfs(String word, TrieNode curr, int index) {
    //     if(index == word.length()) {
    //         return curr.isWord;
    //     }
    //     char c = word.charAt(index);
    //     if(c == '.') {
    //         for(int i = 0; i < 26; i++) {
    //             if(curr.children[i] != null && dfs(word, curr.children[i], index + 1)) {
    //                 return true;
    //             }
    //         }
    //         return false;
    //     } else {
    //         return curr.children[c - 'a'] != null && dfs(word, curr.children[c - 'a'], index + 1);
    //     }
    // }
}