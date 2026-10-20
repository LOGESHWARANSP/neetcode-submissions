class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
     if(word==null || abbr==null)
        {
            return false;
        }
     int a=0;
     int b=0;
     while(a< word.length() && b < abbr.length()){
        if(Character.isDigit(abbr.charAt(b))){
            if(abbr.charAt(b)=='0'){
                return false;
            }
            int tot=0;
            while(b< abbr.length() && Character.isDigit(abbr.charAt(b))){
                tot=tot*10 +abbr.charAt(b)-'0';
                b++;
            }
            a+=tot;
        }
        else{
            if(word.charAt(a)!=abbr.charAt(b)){
                return false;
            }
        a++;
        b++;
        }
       
     }
     return a==word.length() && b==abbr.length();
    }
}