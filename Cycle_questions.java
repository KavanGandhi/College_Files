public class Cycle_questions {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return  true;
            }
        }
        return false;
    }

    // find the length of the cycle
    public int lengthCycle(ListNode head) {
        int size = 0;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                do{
                    slow = slow.next;
                    size++;
                }while(fast != slow);
            }
        }
        return 0;
    }
}
