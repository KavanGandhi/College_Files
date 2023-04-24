public class Queue_Arr {
    int a[];
    int capacity;
    int rear,front;

    public Queue_Arr(int n)
    {
        capacity = n;
        a = new int[n];
        rear=-1;
        front=-1;
    }

    void enQueue(int val)
    {
        
        if(rear==capacity-1)
        {
            System.out.println("Queue overflow");
        }
        if(front==-1)
        {
            front=0;
        }
        else{
            rear++;
            a[rear] = val;
        }
    }

    int deQueue()
    {
        if(rear == -1)
        {
            System.out.println("Queue underflow");
        }
        else
        {
            int res = a[0];
            front++;
            return res;
        }
    }
}
