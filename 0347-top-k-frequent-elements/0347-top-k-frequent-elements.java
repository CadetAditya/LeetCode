class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        

        HashMap<Integer,Integer> hm=new HashMap<>();

       for(int n: nums){
            hm.put(n , hm.getOrDefault(n,0)+1);
       }

       PriorityQueue<Integer> pq=
            new PriorityQueue<>(
                (a,b) -> Integer.compare(hm.get(a),hm.get(b))
                         );

        for(int num: hm.keySet()){
            pq.offer(num);

            if(pq.size() > k) pq.poll();
        }

        int arr[]= new int[k];

        for(int i=0;i<k;i++){
            arr[i]=pq.poll();
        }

        return arr;
    }
}