class MyCalendarTwo {
    TreeMap<Integer,Integer> hm;
    int limit;
    public MyCalendarTwo() {
        hm = new TreeMap<>();
        limit = 2;
    }
    
    public boolean book(int start, int end) {
        
        hm.put(start,hm.getOrDefault(start,0) + 1);
        hm.put(end,hm.getOrDefault(end,0) - 1);
        
        int threshold = 0 ;
        for(int i : hm.keySet()){

          threshold = threshold + hm.get(i);

          if(threshold > limit){
                 
            hm.put(start,hm.getOrDefault(start,0) - 1);
            hm.put(end,hm.getOrDefault(end,0) + 1);
            
            return false;
          }
        }

        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(startTime,endTime);
 */