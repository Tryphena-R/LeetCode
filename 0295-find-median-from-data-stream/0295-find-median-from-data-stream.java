class MedianFinder {
    PriorityQueue<Integer> minheap= new PriorityQueue<>();
    PriorityQueue<Integer> maxheap= new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(maxheap.isEmpty()==true || maxheap.peek()>num){
            maxheap.offer(num);
        }
        else{
            minheap.offer(num);
        }
        if(minheap.size()-maxheap.size()>1){
            maxheap.offer(minheap.peek());
            minheap.poll();
        } 
        else if(maxheap.size()-minheap.size()>1){
            minheap.offer(maxheap.peek());
            maxheap.poll();
        }
    }
    
    public double findMedian() {
        if(minheap.size()==0 && maxheap.size()==0)
            return 0;
        if(minheap.size()==maxheap.size()){
            int topmax= maxheap.peek();
            int topmin= minheap.peek();
            return (double)(topmax+topmin)/2; 
        }
        else if(maxheap.size()>minheap.size()){
            return maxheap.peek();
        }
        return minheap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */