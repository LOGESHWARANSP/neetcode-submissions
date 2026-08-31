class TimeMap {
      HashMap<String,ArrayList<String>>map;
      HashMap<String,ArrayList<Integer>>time;

    public TimeMap() {
        map=new HashMap<>();
        time=new HashMap<>();
        
    }
    
    public void set(String key, String value, int timestamp) {

        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
            time.put(key,new ArrayList<>());
        }
        map.get(key).add(value);
        time.get(key).add(timestamp);
        
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }
        ArrayList<String>values=map.get(key);
        ArrayList<Integer>times=time.get(key);
        String result="";
        for(int i=0;i<times.size();i++){
            if(times.get(i)<=timestamp){
                result=values.get(i);
            }
            else{
                break;
            }
        }
        return result;
        
    }
}
