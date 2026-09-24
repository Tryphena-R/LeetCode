class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character, Character> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c1= s.charAt(i);
            char c2= t.charAt(i);
            if(map.containsValue(c2) && !map.containsKey(c1))
                return false;
            if(map.containsKey(c1) && !map.get(c1).equals(c2))  
                return false;
            else
                map.put(c1,c2);
        }
        return true;
    }
}