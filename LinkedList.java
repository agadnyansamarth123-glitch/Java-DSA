public class LinkedList {
    public static  class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;

        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) 
    {    Node newNode = new Node(data);
        size++;
        if (head == null)
        {
            head= tail =newNode;
            return;
        }
       
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return ;
        }
        tail.next = newNode;
        tail = newNode;

    }
    public void PrintLL(){
        if(head==null){
            System.out.println("Linked List is empty");
            return ;
        }
        Node temp = head;
        while(temp!=null)
        {   System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }
     
    public void addMiddle(int idx ,int data)
    {   
        if(idx == 0)
        {
            addFirst(data);
            return;
        }
        Node temp = head;
        int i = 0;
        while(i < idx-1)
        {
           i++;
           temp = temp.next;
        }
        Node newNode = new Node(data);
        size++;
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removeFirst()
    {   
        if(size == 0)
        {
            System.out.println("LinkedList is Empty");
            return Integer.MAX_VALUE;
        }
        else if (size == 1)
        {
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
     public int removeLast()
     {
         if(size == 0)
        {
            System.out.println("LinkedList is Empty");
            return Integer.MAX_VALUE;
        }
        else if (size == 1)
        {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node temp = head;
        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;

     }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.PrintLL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addMiddle(2,3 );
        ll.PrintLL();


        
    }
}
