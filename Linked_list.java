class LL{
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }
// inserting from first
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;

        if(tail==null)
        {
            tail=head;
        }
        size++;
    }
// inserting from last
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
        size++;
    }

    public void insert(int val,int index)
    {
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next= node;
        size++;
    }

    public void insert_num(int val,int find)
    {
        Node temp = head;
        // int fin = find;
        while(temp.value !=val){
            temp=temp.next;
        }
        Node node = new Node(find,temp.next);
        temp.next= node;
        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        return val;
    }

    public int deleteLast(){
        int val = tail.value;
        if(head!=tail){
            Node temp = head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            tail=temp;
            tail.next=null;
        }
        else{
            head=tail=null;
        } 
       return val;
    }

    public int deleteAny(int index){
        int val;
        if(index==0){
            val = deleteFirst();
            return val;
        }
        if(index==size-1){
            val = deleteLast();
            return val;
        }
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        val = temp.next.value;
        temp.next = temp.next.next;
        return val;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
         System.out.print(temp.value + " -> ");
         temp=temp.next;
        }
        System.out.print("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value=value;
        }

        public Node(int value,Node next)
        {
            this.value=value;
            this.next=next;
        }
    }
}

public class Linked_list {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(12);
        list.insertFirst(23);
        list.insertFirst(11);
        list.insertLast(90);
        // list.insert(8, 3);
        list.insert_num(23,13);
        list.display();
        // System.out.println("\n First "+list.deleteFirst());
        // list.display();
        // System.out.println("\n Last "+list.deleteLast());
        // list.display();
        // System.out.println("\n Delete any "+list.deleteAny(2));
        // list.display();

    }
}