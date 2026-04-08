class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Linked{
    Node head;
    public void insertAtStart(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        Node temp = head;
        if(head==null){
            head=newNode;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void insertAtPos(int pos,int data){
        if(pos==0) {
            insertAtStart(data);
            return;
        }
        Node newNode=new Node(15);
        Node temp = head;
        for(int i=0;i<pos-1;i++){
            if(temp==null) return;
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void deleteAtStart(){
        if(head==null)
            return;
        head=head.next;
    }
    public void deleteAtPos(int pos){
        if(head==null) return;
        if(pos==0){
            deleteAtStart();
            return;
        }
        Node temp=head;
        for(int i=0;i<pos-1;i++){
            if(temp.next==null) return;
            temp=temp.next;
        }
        if(temp.next!=null)
        temp.next=temp.next.next;
    }
    public void deleteAtEnd(){
        if(head==null) return;
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public Node reverseList(Node head){
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next; // store next
            curr.next = prev;          // reverse link
            prev = curr;               // move prev forward
            curr = next;               // move curr forward
        }

        return prev; // new head
    }
    public void display(){
        Node temp = head;
        while(temp.next!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print(temp.data+"->");
        System.out.println("null");
    }
}
public class LinkedList {
    public static void main(String[] args) {
        Linked list = new Linked();
        list.insertAtStart(5);
        list.insertAtEnd(12);
        list.insertAtStart(1);
        list.insertAtStart(10);
        //list.insertAtEnd(8);
        //list.deleteAtStart();
        //list.deleteAtEnd();
        list.deleteAtPos(2);  
        list.insertAtPos(3,17);  
        list.head = list.reverseList(list.head);
        list.display();
        
    }    
}
