class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> minheap= new PriorityQueue<>();
        for(ListNode list: lists){
            ListNode head=list;
            while(head!=null){
                minheap.offer(head.val);
                head=head.next;
            }
        }
        if(minheap.isEmpty())   return null;
        ListNode dummy= new ListNode(minheap.poll());
        ListNode temp= dummy;
        while(!minheap.isEmpty()){
            temp.next= new ListNode(minheap.poll());
            temp= temp.next;
        }
        return dummy;
    }
}