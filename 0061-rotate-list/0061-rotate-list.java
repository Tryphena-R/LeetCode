/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0)  return head;
        Stack<ListNode> st= new Stack<>();
        ListNode temp= head;
        int length=1;
        while(temp.next!=null){
            st.push(temp);
            temp= temp.next;
            length++;
        }
        int count=0;
        k= k%length;
        while(count<k && st.size()>0){
            ListNode curr= st.pop();
            curr.next.next= head;
            head= curr.next;
            curr.next= null;
            count++;
        }
        return head;
    }
}