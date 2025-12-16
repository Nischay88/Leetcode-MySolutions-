class DataStream {
    HashMap<Integer,Integer> hm = new HashMap<>();
    int k;
    int value;

    public DataStream(int value, int k) {
        this.value = value;
        this.k = k;
        hm.put(value, 0);
    }

    public boolean consec(int num) {

        if (num == value) {
            hm.put(value, hm.get(value) + 1);
        } else {
           
            hm.put(value, 0);
        }

        return hm.get(value) >= k;
    }
}
