class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String,Character>string_map=new HashMap<>();
        HashMap<Character,String>char_map=new HashMap<>();
        String[] words=s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        for(int i=0;i<words.length;i++){
            char ch=pattern.charAt(i);
            String word=words[i];
            if(!char_map.containsKey(ch)){
                if(string_map.containsKey(word)){
                    return false;
                }
                else{
                    char_map.put(ch,word);
                    string_map.put(word,ch);
                }
            }
            else{
                String mapped=char_map.get(ch);
                if(!mapped.equals(word)){
                    return false;
                }
            }
        }
        return true;
        
    }
}