class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(
            (a,b) -> (b-a)
        );

        for(int stone: stones) pq.offer(stone);

        while(pq.size() >= 2){
            int n1=pq.poll();
            int n2=pq.poll();

            if(n1==n2) continue;

            pq.offer(n1-n2);
        }

        if(pq.size() == 0) return 0;

        return pq.poll();
    }
}