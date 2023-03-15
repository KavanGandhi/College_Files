 class CLL {

    Node head;
    Node tail;

    public CLL(){
        this.head = null;
        this.tail = null;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        if(head==null){
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        tail.next = node;
        head = node;
    }

    public void deleteAny(int val){
        Node node = head;
        if(node==null){
            return;
        }
        if(node.value == val){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node n = node.next;
            if(n.value == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node!=head);
    }

    public void display(){
        Node temp = head;
        if(head!=null){
            do{
                System.out.print(temp.value + "->");
                temp = temp.next;
            }while(temp!=head);
            System.out.println("END");
        }
    } 


    private class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }
}

public class Circular_Linked_list {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insertFirst(3);
        list.insertFirst(12);
        list.insertFirst(23);
        list.insertFirst(11);
        list.insertFirst(10);
        list.display();
        list.deleteAny(23);
        list.display();
    }
}
