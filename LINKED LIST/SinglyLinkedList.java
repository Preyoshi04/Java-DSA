// Main class for linked list implementation
public class SinglyLinkedList
{
    // Node class (represents each element in the linked list)
    static class Node
    {
        int value;   // stores the data of the node
        Node next;   // stores reference to the next node

        // Constructor for creating a node with value and next reference
        Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }

        // Constructor for creating a node with only value
        Node(int value)
        {
            this.value = value;
        }
    }

    // Converts an array into a linked list
    static Node convertArrayToLL(int[] arr)
    {
        Node head = new Node(arr[0]);  // first node becomes head
        Node mover = head;             // mover is used to build the list

        // loop through rest of the array and keep attaching new nodes
        for(int i = 1; i < arr.length; i++)
        {
            Node temp = new Node(arr[i]); // create a new node
            mover.next = temp;            // link it to the previous node
            mover = temp;                 // move 'mover' forward
        }
        return head;  // return the head of the linked list
    }

    // Prints all elements of the linked list
    static void printLL(Node head)
    {
        Node temp = head; // start from head
        while(temp != null)  // traverse until the end
        {
            System.out.println(temp.value); // print current node's value
            temp = temp.next;               // move to next node
        }
    }

    // Returns the length of the linked list
    static int printLength(Node head)
    {
        Node temp = head;  // start from head
        int count = 0;     // counter for nodes
        while(temp != null)  // traverse until the end
        {
            temp = temp.next; 
            count++;         
        }   
        return count;  // total number of nodes
    }

    // Main method to test our linked list
    public static void main(String args[])
    {
        int[] arr = {1,2,3,4,5};  // input array

        // convert array into linked list
        Node result = convertArrayToLL(arr);

        // print linked list elements
        printLL(result);

        // print length of linked list
        System.out.println("The length of the list is " + printLength(result));
    }
}
