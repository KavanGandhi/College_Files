public class Queue_LL {
    Node front;
    Node rear;

    public void enQueue(int val)
    {
        Node node = new Node(val);
        if(front==null)
        {
            front = node;
            rear = node;
            return;
        }
        rear.next = node;
        rear = node;
    }
    public int deQueue()
    {
        if(front==null)
        {
            throw new Exception();
        }
        int result = front.val;
        front = front.next;
        return result;
        
    }
    public class Node{
        int val;
        Node next;
        Node(int val)
        {
            this.val=val;
        }
    }
}
