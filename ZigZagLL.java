import java.util.* ;

import org.w3c.dom.Node;

public class ZigZagLL {

    

    public Node getmid(Node head)
    {   
        Node slow = head;
        Node fast = head.next;

        while(fast!=null&&fast.next!= null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public static void main(String[] args) {
        LinkedList  ll = new LinkedList ();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
    
    }

    

}
