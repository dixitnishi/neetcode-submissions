class TimeMap {
    Map<String,List<Data>> timemap;

    public TimeMap() {
        this.timemap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        List<Data> temp = timemap.getOrDefault(key,new ArrayList<>(timestamp+1));
        temp.add(new Data(value,timestamp));
        timemap.put(key,temp);
    }
    
    public String get(String key, int timestamp) {
        List<Data> temp = timemap.getOrDefault(key, new ArrayList<>());
        int i = 0;
        int j = temp.size()-1;
        String res = "";
        while(i<=j){
            int mid = (i+j)/2;
            if(temp.get(mid).getTimestamp() <= timestamp){
                res = temp.get(mid).getValue();
                i = mid + 1;

            }
            else{
                j = mid-1;
            }

        }
        return res;
    }
}

class Data{

    private String value;
    private int timestamp;
    public Data(String value,int timestamp){
        this.value = value;
        this.timestamp = timestamp;
    }

    public int getTimestamp(){
        return this.timestamp;
    }

    public String getValue(){
        return this.value;
    }
}
