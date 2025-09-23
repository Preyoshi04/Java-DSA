public class DeletionSinglyLL {
    //linkedlist
    static class Node
    {
        int value;
        Node next;

        Node(int value,Node next)
        {
            this.value=value;
            this.next=next;
        }

        Node(int value)
        {
            this.value=value;
        }
    }
    //delete first node
    static Node deleteFirstNode(Node head)
    {
        if(head == null)
        {
            return head;
        }
        head = head.next;
        return head; //returns the new first node and deltes the prev       
    }

    //delete last node
    static Node deleteLastNode(Node head)
    {
        if(head==null || head.next==null)
        {
            return null;
        }
        Node temp = head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    //delet "k"th mode
    static Node deleteKNode(Node head,int k)
    {
        if(head == null)
        {
            return null;
        }
        if(k==1)
        {
            return deleteFirstNode(head);   
        }
        Node temp = head;
        Node prev = null;
        int counter=0;
        while(temp!=null)
        {
            counter++;
            if(counter==k)
            {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
            

            if(temp==null)
            {
                System.out.println("k is larger than list size");
                return head;
            }
        }
        return head;
    }

    //delete given element value
    static Node deleteElement(Node head, int el)
    {
        if(head == null)
        {
            return null;
        }
        if(head.value==el)
        {
            return deleteFirstNode(head);
        }
        Node temp = head;
        Node prev = null;
        while(temp!=null)
        {
            if(temp.value==el)
            {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp=temp.next;
        }
        return head;
    }

    static void printLL(Node head)
    {
        Node temp = head; // start from head
        while(temp != null)  // traverse until the end
        {
            System.out.println(temp.value); // print current node's value
            temp = temp.next;               // move to next node
        }
    }

     public static void main(String[] args) {
        // create list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
        Node head = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, new Node(6, null))))));

        System.out.println("Original list:");
        printLL(head);

        // delete first node
        head = deleteFirstNode(head);
        System.out.println("After deleting first node:");
        printLL(head);

        //delet last node
        head = deleteLastNode(head);
        System.out.println("After deleting last node:");
        printLL(head);

         //delet kth node
        head = deleteKNode(head,3);
        System.out.println("After deleting :");
        printLL(head);

         //delet given value
        head = deleteElement(head,3);
        System.out.println("After deleting :");
        printLL(head);
    }

}
