class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        HashSet<Character>set=new HashSet<>();
        for(char c:allowed.toCharArray()){
            set.add(c);
        }        
        for(String s :words){
            boolean checks=true;
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(!set.contains(ch)){
                    checks=false;
                    break;
                }
            }
            if(checks){
                count++;
            }
        }
        return count;
    }
}