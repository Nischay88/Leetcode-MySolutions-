class MyCalendarThree {
    TreeMap<Integer,Integer> hm;
    
    public MyCalendarThree() {
        hm = new TreeMap<>();
    }
    
    public int book(int start, int end) {
        hm.put(start,hm.getOrDefault(start,0) + 1);
        hm.put(end,hm.getOrDefault(end,0) - 1);

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i : hm.keySet()){

            sum = sum + hm.get(i);

            max = Math.max(max,sum);

        }
        return max;
    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(startTime,endTime);
 */
  