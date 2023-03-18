 class duplicate_LL {
    private Node head;
    private Node tail;
    private int size;

    public duplicate_LL(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;

        if(tail==null)
        {
            tail=head;
        }
    }
    public void insertLast(int val){
        if(tail==null)
        {
            // inserting first element if there ard no elements
            insertFirst(val);
        }
        else{
            Node node =  new Node(val);
            tail.next=node;
            tail=node;
        }
    }

    public void duplicate(){
        Node node = head;
        while(node.next!=null){
        if(node.value == node.next.value){
            node.next = node.next.next;
            size--;
        }
        else{
            node = node.next;
        }
        tail = node;
        node.next = null;
    }
}

    public void display(){
        Node temp=head;
        while(temp!=null){
         System.out.print(temp.value + " -> ");
         temp=temp.next;
        }
        System.out.print("END\n");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value=value;
        }

        // public Node(int value,Node next)
        // {
        //     this.value=value;
        //     this.next=next;
        // }
    }
}

class leet_duplicate{
    public static void main(String[] args) {
        duplicate_LL l = new duplicate_LL();
        l.insertLast(1);
        l.insertLast(1);
        l.insertLast(2);
        l.insertLast(3);
        l.insertLast(3);
        l.insertLast(4);
       
        l.display();
        l.duplicate();
        l.display();
        
    }
}


