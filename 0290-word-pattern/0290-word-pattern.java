class Solution {
    public boolean wordPattern(String pattern, String s) {
            String[] words = s.split(" ");
            if(words.length!=pattern.length())
                return false;
            Map<Character, String> map= new HashMap<>();
            for(int i=0;i<pattern.length();i++){
                char c= pattern.charAt(i);
                if(map.containsValue(words[i]) && !map.containsKey(c))
                    return false;
                if(map.containsKey(c) && !map.get(c).equals(words[i]))
                    return false;
                else
                    map.put(c,words[i]);
            }
            return true;
        }
}