class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map =new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
  PriorityQueue<Character> q = new PriorityQueue((a,b)->(map.get(b)-map.get(a)));
    for(char c:map.keySet()){
        q.add(c);
    }
    StringBuilder sd=new StringBuilder();
    while(q.size()> 0){
        char c=q.poll();
        for(int i=0;i<map.get(c);i++){
            sd.append(c);
        }
    }
    return sd.toString();


    }
}