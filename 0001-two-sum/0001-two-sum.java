class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
            }

        for(int i=0;i<nums.length;i++){
            int y=target-nums[i];
            if(hm.containsKey(y) && hm.get(y)!=i){
                return new int[]{i,hm.get(y)};
            }
        }

    return new int[]{0,0};
    }


}