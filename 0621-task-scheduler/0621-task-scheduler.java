class Solution {
    public int leastInterval(char[] tasks, int n) {
        int len= tasks.length;
        int count=0;
        HashMap<Character, Integer> map= new HashMap<>();
        for(int i=0;i<len;i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
        PriorityQueue<Integer> q= new PriorityQueue<>(Collections.reverseOrder());
        for(var it:map.entrySet()){
            q.offer(it.getValue());
        }
        while(!q.isEmpty()){
            int cycle= n+1;
            ArrayList<Integer> l= new ArrayList<>();
            while(!q.isEmpty() && cycle!=0){
                var it= q.peek();
                q.poll();
                if(it-1>0){
                    l.add(it-1);
                }
                count++;
                cycle--;
            }
            for(var it:l){
                q.offer(it);
            }
            if(q.isEmpty()==true){
                break;
            }
            count= count+cycle;
        }
        return count;
    }
}