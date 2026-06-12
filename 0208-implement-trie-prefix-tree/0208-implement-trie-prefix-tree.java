class Trie {
    static class Node{
    Node hash[]= new Node[26];
    int flag=0;
    }
    Node head= new Node();
    public Trie() {
        
    }
    
    public void insert(String word) {
        Node p= head;
        for(int i=0;i<word.length();i++){
            if(p.hash[word.charAt(i)-'a']==null){
                p.hash[word.charAt(i)-'a']= new Node();
                p= p.hash[word.charAt(i)-'a'];
            }
            else{
                p= p.hash[word.charAt(i)-'a'];
            }
        }
        p.flag= 1;
    }
    
    public boolean search(String word) {
        Node p= head;
        for(int i=0;i<word.length();i++){
            if(p.hash[word.charAt(i)-'a']==null)
                return false;
            p= p.hash[word.charAt(i)-'a'];
        }
        if(p.flag==1)
        {
            return true;
        }
        return false;
    }
    
    public boolean startsWith(String word) {
        Node p= head;
        for(int i=0;i<word.length();i++){
            if(p.hash[word.charAt(i)-'a']==null){
                return false;
            }
            p=p.hash[word.charAt(i)-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */