class MapSum {
    HashMap<String,Integer>hm; //declaring hashmap
    public MapSum() {
        hm = new HashMap<>(); //creating a map
    }
    
    public void insert(String key, int val) {
        hm.put(key,val); //inserting values
    }
    
    public int sum(String prefix) {
        int a = 0;
        for(String b : hm.keySet()) //to access the key
        {
            if(b.startsWith(prefix))
            {
                a+=hm.get(b);
            }
        }
        return a;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */