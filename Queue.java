class queues{
    int front,rear,capacity;
    int a[];
    public queues(int size){
        front=-1;
        rear=-1;
        capacity=size;
        a=new int[capacity];
    }

    void arrayqueue(int item){
        if(rear<capacity-1){
            if(front==-1){
                front=0;
                rear=0;
            }
            else{
                rear+=1;
            }
            a[rear]=item;
        }
    }

    void array_deque(){
        if(front>=0){
            if(front==rear){
                front=-1;
                rear=-1;
            }
            else{
                front+=1;
            }
        }
        System.out.println("Element deleted "+a[front-1]);

    }

    void display(){
        if (front == rear) {   
            System.out.printf("Queue is Empty\n");   
            return;   
        }   
        for(int i=front;i<=rear;i++)
        {
            System.out.println(a[i]);
        }
    }
}

public class Queue{
    public static void main(String[] args) {
        queues q = new queues(5);
        q.arrayqueue(2);
        q.arrayqueue(3);
        q.arrayqueue(4);
        q.arrayqueue(5);
        q.arrayqueue(7);


        q.display();
        q.array_deque();
        q.array_deque();
        q.display();

        
        
    }
}
