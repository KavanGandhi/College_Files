class circular_queue
{
    int a[],n;
    int front=-1;
    int rear=-1;

    public circular_queue(int n)
    {
        this.n=n;
        a=new int[n];
    }

    void enQueue(int val)
    {
        if(front==((rear+1)%n))
        {
            return;
        }
        if(front==-1)
        {
            front=0;
        }
        rear=(rear+1)%n;
        a[rear]=val;
    }
    int deQueue()
    {
        if(front==-1)
        {
            System.out.println("Underflow");
        }
        int result = a[front];
        if(front==rear)
        {
            front=rear=-1;
        }
        else
        {
            front = (front+1)%n;
        }
        return result;
    }
    

}
    
    

