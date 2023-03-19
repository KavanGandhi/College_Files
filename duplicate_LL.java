 class duplicate_LL {
    private Node head;
    private Node tail;
    
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
        }
        else{
            node = node.next;
        }
        tail = node;
        node.next = null;
    }
}

    public static duplicate_LL merge(duplicate_LL first, duplicate_LL second)
    {
        Node f = first.head;
        Node s = second.head;

        duplicate_LL ans = new duplicate_LL();

        while(f.next!=null && s.next!=null){
            if(f.value>s.value){
                ans.insertLast(s.value);
                s = s.next;
            }
            else{
                ans.insertLast(f.value);
                f = f.next;
            }
        }
        while(f!=null){
            ans.insertLast(f.value);
            f=f.next;
        }
        while(s!=null){
            ans.insertLast(s.value);
            s=s.next;
        }

        return ans;

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

    public static void main(String[] args) {
        duplicate_LL first = new duplicate_LL();
        duplicate_LL second = new duplicate_LL();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);
        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        duplicate_LL ans = merge(first,second);
        ans.display();
    }
}




