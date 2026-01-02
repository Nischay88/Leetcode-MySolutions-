class Solution {
    public int repeatedNTimes(int[] nums) {

      HashMap<Integer,Integer> hm = new HashMap<>();
      
      for(int i : nums){

        if(hm.containsKey(i)){
            hm.put(i,hm.get(i)+1);
        }
        else{
            hm.put(i,1);
        }
      }
      
      int cnt = 0 ;
      int n = nums.length/2;
      for(int i : hm.keySet()){
       
        if(hm.get(i) == n){
            return i;
        }
          
      }
      return -1;

    }
}