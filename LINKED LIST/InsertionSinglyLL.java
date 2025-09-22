public class InsertionSinglyLL {
    // Node class for singly linked list
    static class Node
    {
        int value;  // value of the node
        Node next;  // pointer to the next node

        // Constructor with value and next node
        Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }

        // Constructor with only value (next is null by default)
        Node(int value)
        {
            this.value = value;
        }
    }

    // Insert at the beginning of the linked list
    static Node insertFirst(Node head, int val)
    {
        // Create a new node with value 'val' and link it to the current head
        Node newNode = new Node(val, head);  // newNode.next points to head
        return newNode; // newNode becomes the new head
    }

    // Insert at the end of the linked list
    static Node insertEnd(Node head , int val)
    {
        Node newNode = new Node(val); // Create a new node with value 'val'

        // If the list is empty, new node becomes head
        if(head == null)
        {
            return newNode;
        }

        Node temp = head;
        // Traverse to the last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Link the last node's next to the new node
        temp.next = newNode;
        return head; // head remains same
    }

    // Insert at the k-th index (1-based indexing)
    static Node insertKIndex(Node head, int k, int val)
    {
        Node newNode = new Node(val); // create new node

        // If list is empty, return new node as head
        if(head == null)
        {
            return newNode;
        }

        // If inserting at the first position
        if(k == 1)
        {
            return insertFirst(head, val);
        }

        int counter = 1;       // counter to track position
        Node temp = head;      // start from head

        // Traverse the list
        while(temp != null)
        {
            // Stop at (k-1)-th node to insert after it
            if(counter == k-1)
            {
                newNode.next = temp.next;  // newNode points to next node
                temp.next = newNode;       // previous node points to newNode
                // break;  // can use break to stop traversal after insertion
            }
            counter++;
            temp = temp.next;  // move to next node
        }

        return head; // head remains same
    }

    // Print the linked list
    static void printLL(Node head)
    {
        Node temp = head; // start from head
        while(temp != null)  // traverse until the end
        {
            System.out.print(temp.value + " -> "); // print current node's value
            temp = temp.next;               // move to next node
        }
        System.out.println("null"); // indicate end of list
    }

    public static void main(String[] args) {
        // Create list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
        Node head = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, new Node(6, null))))));

        System.out.println("Original list:");
        printLL(head);

        // Inserting at beginning
        System.out.println("After inserting at the beginning:");
        head = insertFirst(head, 10); // head changes
        printLL(head);

        // Inserting at end
        System.out.println("After inserting at the end:");
        head = insertEnd(head, 10); // head remains same
        printLL(head);

        // Inserting at k-th index
        System.out.println("After inserting at the given index:");
        head = insertKIndex(head, 4, 10); // insert 10 at 4th position
        printLL(head);
    }
}
