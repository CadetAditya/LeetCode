class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int li=triangle.size();

        List<List<Integer>> cost=new ArrayList<>();

        cost.add(triangle.get(0));


        for(int i=1; i<li; i++){
            ArrayList<Integer> arr=new ArrayList<>();

            for(int j=0; j<triangle.get(i).size(); j++){
                int r=Integer.MAX_VALUE;
                int l=Integer.MAX_VALUE;
                if(j > 0){
                    r=cost.get(i-1).get(j-1)+triangle.get(i).get(j);
                }
                
                if(j < cost.get(i-1).size()){
                    l=cost.get(i-1).get(j)+triangle.get(i).get(j);
                }

                arr.add(j,Integer.min(l,r));
            }

            cost.add(arr);

        }

        int min=Collections.min(cost.get(li-1));

        return min;


        
    }
}