package linkedlist;

public class InsertAtLast {

    public static void main(String[] args) {
        Node head=new Node(10);
        //insert element in linkedlist
        insert(head,20);
        insert(head,30);
        insert(head,40);
        InsertAtLast.print(head);
    }
    public  static  void insert(Node head,int value){
        if(head==null){
            head=new Node(value);
            return;
        }
        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(value);
    }

    private static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }
}
