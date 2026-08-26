class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>>map=new HashMap<>();
        for(String s:strs){
            char[] ch=s.toCharArray();
        
        Arrays.sort(ch);
        String sorteds=new String(ch);
        map.putIfAbsent(sorteds,new ArrayList<>());
        map.get(sorteds).add(s);
    }
    return new ArrayList<>(map.values());
    }
}
