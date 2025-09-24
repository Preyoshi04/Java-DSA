class DoublyLinkedList
{
    //creating LL
    static class Node
    {
        int value;
        Node next;
        Node prev;

        Node(int value,Node prev,Node next)
        {
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
        Node(int value)
        {
            this.value=value;
            next=null;
            prev=null;
        }
    }
    //converting array into linked list
    static Node arrayToList(int[] arr)
    {
        Node head = new Node(arr[0]);
        Node temp = head;

        for(int i=1;i<arr.length;i++)
        {
            Node newNode = new Node(arr[i]);
            newNode.prev = temp;
            temp.next = newNode;
            temp = newNode;
        }
        return head;
    }

    //print linked list
    static void printLL(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println();
    }

    //print length of the list
    static int printLength(Node head)
    {
        Node temp = head;
        int count=0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        return count;
    }

    public static void main(String args[])
    {
        Node newNode = new Node(1, null, null); //creating 1 node in doubly ll
        System.out.println(newNode.value);

        //converting array into doubly ll
        int[] arr = {1,2,3,4,5,6};
        Node head = arrayToList(arr);
        printLL(head);

        //length
        System.out.println("The length of the list is "+printLength(head));

    }
}