class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);

        int left=(nums.length-1) / 2;
        int right=nums.length-1;

        int[] res=new int[nums.length];

        for(int i=0; i<nums.length; i++){
            if(i%2==0) res[i]=nums[left--];
            else res[i]=nums[right--];

        }

        for(int i=0; i<nums.length; i++){
            nums[i]=res[i];
        }
    }
}