class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    public void insertAtStart(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void insertAtPosition(int pos,int data){
        if(pos==0){
            insertAtStart(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        for(int i=0;i<pos-1;i++){
            if(temp==null) return;
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void deleteAtStart(){
        if(head==null) return;
        head=head.next;
    }
    public void deleteAtEnd(){
        if(head==null) {
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void deleteAtPosition(int pos){
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
        temp.next=temp.next.next;
    }
    public void reverseList(ListNode head) {
        Node prev=null;
        Node nxt;
        Node curr=head;
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        head = prev;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
}

public class Linked {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertAtStart(10);
        list.insertAtStart(34);
        list.deleteAtPosition(1);
        list.insertAtPosition(0, 4);
        list.insertAtEnd(19);
        list.deleteAtStart();
        list.deleteAtEnd();
        list.display();
    }
}
