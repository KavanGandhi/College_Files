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
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                int size = 0;

                do{
                    slow = slow.next; 
                    size++;
                }while(fast != slow);
            }
            return size;
        }
        return 0;
    }

    public ListNode detectCycle(ListNode head){
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                length = lengthCycle(slow);
                break;
            }
        }
    if(length==0){
        return null;
    }

            // find the start node
            ListNode f = head;
            ListNode s = head;
            while(length>0){
                s = s.next;
                length--;
            }
            // keep moving foeward and they will meet at start of cycle
            while(f!=s){
                f = f.next;
                s = s.next;
            }
            return f;
    }
}
