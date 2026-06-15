class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr= new ArrayList<>();
        for(ListNode head: lists) {
            while(head != null) {
                arr.add(head.val);
                head = head.next;
            }
        }
        Collections.sort(arr);
        ListNode dummy= new ListNode();
        ListNode temp= dummy;
        for (int num:arr) {
            temp.next= new ListNode(num);
            temp= temp.next;
        }
        return dummy.next;
    }
}