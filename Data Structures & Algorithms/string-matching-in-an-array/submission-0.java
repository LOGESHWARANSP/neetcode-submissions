class Solution {
    public List<String> stringMatching(String[] words) {
        List<String>res=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                String word1=words[i];
                String word2=words[j];
                if(word1.length()>=word2.length()){
                    continue;
                }
                if(isSubsequence(words[i],words[j])){
                    res.add(words[i]);
                    break;
                }
            }
        }
        return res;
        
    }
    private static boolean isSubsequence(String w1,String w2){
        if(w2.contains(w1)){
            return true;
        }
        return false;
    }
}