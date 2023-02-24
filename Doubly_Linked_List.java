 class DLL{
    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
    }  
    
    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head==null){
            node.prev=null;
            return;
        }
        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
    }

    public void display(){
        Node temp = head;
        Node last=null;//for displaying in reverse
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            last=temp;
            temp=temp.next;
        }
        System.out.print("END\n");
        
        while(last!=null){
            
            System.out.print(last.value+" -> ");
            last = last.prev;
        }
        System.out.print("START");
    }

   

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value=value;
        }

        // public Node(int value,Node next,Node prev){
        //     this.value=value;
        //     this.next=next;
        //     this.prev=prev;
        // }
    }
}

public class Doubly_Linked_List {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(12);
        list.insertFirst(23);
        list.insertFirst(11);
        list.insertLast(99);

        list.display();
    }
}
