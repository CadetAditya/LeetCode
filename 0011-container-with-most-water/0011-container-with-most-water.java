class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;

        int area=-1;

        while(left < right){

            int h=Math.min(height[left],height[right]);
            int l=(right-left);

            area=Math.max(area,l*h);

            if(height[left] < height[right]) left++;
            else right--;

        }

        return area;
    }
}