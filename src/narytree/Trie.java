package narytree;

import java.util.HashMap;
import java.util.Map;

class Trie {

    private class TrieNode {
        Map<Character, TrieNode> children;
        boolean endOfWord;
        public TrieNode() {
            children = new HashMap<>();
            endOfWord = false;
        }
    }

    private final TrieNode root;
    public Trie() {
        root = new TrieNode();
    }



    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode current = root;
        for(int i=0;i<word.length();i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if(node == null) {
                node = new TrieNode();
                current.children.put(ch,node);
            }
            current = node;
        }
        current.endOfWord = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode curr = root;
        for(int i=0;i<word.length();i++) {
            char ch = word.charAt(i);
            TrieNode node = curr.children.get(ch);
            if(node == null)
            {

                System.out.print("testasd");
                return false;
            }
            curr = node;
        }
        return curr.endOfWord;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for(char c:prefix.toCharArray()) {
            TrieNode node = current.children.get(c);
            if(node == null) {
                return false;
            }
            current = node;
        }
       /* for(String s:current.children.keySet()) {
            if(s.contains(prefix)) {

            }
        }*/
        return true;
    }

    public static void main(String[] args) {
         Trie obj = new Trie();
            obj.insert("apple");
    boolean param_2 = obj.search("apple");
    boolean param_3 = obj.startsWith("apa");
    System.out.println(param_2);
        System.out.println(param_3);
    }
}