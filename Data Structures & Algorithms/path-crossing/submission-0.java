class Solution {
    public boolean isPathCrossing(String path) {
        
        HashSet<String>set = new HashSet<>();
        int x=0;
        int y=0;
        set.add(x +","+y);
        for(char c:path.toCharArray()){
            if(c=='N'){
                y++;
            }
            if(c=='E'){
                x++;
            }
            if(c=='S'){
                y--;
            }
            if(c=='W'){
                x--;
            }
        
        String aval=x+","+y;
        if(set.contains(aval)){
            return true;
        }
        set.add(aval);
        }
        return false;

    }
}