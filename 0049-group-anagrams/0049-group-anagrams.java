class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map= new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String str= strs[i];
            char[] arr= str.toCharArray();
            Arrays.sort(arr);
            String s= new String(arr);      //sorted string as the key 
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(str);            //map the og stringto the key which is a sorted key
        }
        return new ArrayList<>(map.values());
    }
}