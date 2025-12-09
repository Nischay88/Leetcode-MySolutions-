class Solution {
    public int specialTriplets(int[] nums) {
        HashMap<Integer,Integer> back = new HashMap();
        HashMap<Integer,Integer> front =  new HashMap();
         int MOD = 1000000007;
        for(int i = 1 ; i < nums.length; i++){
            if(front.containsKey(nums[i])){
                int x = front.get(nums[i]);
                front.put(nums[i],x+1);
            }
            else{
                front.put(nums[i],1);
            }
        }
        
        back.put(nums[0],1);
        long cnt = 0 ;   

        for(int i = 1 ; i < nums.length -1 ; i++){
 
            front.put(nums[i], front.get(nums[i]) - 1);
            if(front.get(nums[i]) == 0){
                front.remove(nums[i]);
            }


            int b = nums[i];
            int a = b*2;
            int c = b*2;

            if(back.containsKey(a) && front.containsKey(c)){
                int x = front.get(c);
                int y = back.get(a);

                cnt = (cnt + (long)x * y) % MOD; 
            }

            if(back.containsKey(nums[i])){
                int x = back.get(nums[i]);
                back.put(nums[i],x+1);
            }
            else{
                back.put(nums[i],1);
            }
        }

        return (int) cnt;  
    }
}
