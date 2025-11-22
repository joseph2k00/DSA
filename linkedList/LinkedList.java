package linkedList;

public class LinkedList {
    Node head;

    LinkedList ()
    {
        this.head = null;
    }

    private class Node {
        int value;
        Node next;

        Node(int value) 
        {
            this.value = value;
            next = null;
        }
    }

    public void add(int value) 
    {
        Node newNode = new Node(value);
        if (head == null)
        {
            head = newNode;
            return;
        }
            
        Node currentNode = head;
        while (currentNode.next != null)
            currentNode = currentNode.next;
        currentNode.next = newNode;
    }

    public int length()
    {
        int length = 0;
        Node currentNode = head;
        while (currentNode != null)
        {
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }

    public void insertAtIndex(int value, int index)
    {
        Node newNode = new Node(value);
        
        if (index == 0 && head == null)
        {
            head = newNode;
            return;
        }

        if (index == 0)
        {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node previousNode = head;
        Node currentNode = head.next;
        int currentIndex = 1;

        while (currentNode != null)
        {
            if (currentIndex == index)
            {
                previousNode.next = newNode;
                newNode.next = currentNode;
                return;
            }

            previousNode = currentNode;
            currentNode = currentNode.next;
            currentIndex++;
        }

        System.out.println("Linked List index out of bounds");
    }

    public void deleteAtIndex(int index)
    {
        if (head == null)
        {
            System.out.println("Empty Linked List");
            return;
        }

        if (head.next == null && index == 0) 
        {
            head = null;
            return;
        }

        if (index == 0) 
        {
            head = head.next;
            return;
        }
        
        Node previousNode = head;
        Node currentNode = head.next;
        int currentIndex = 1;

        while (currentNode != null)
        {
            if (currentIndex == index)
            {
                previousNode.next = currentNode.next;
                return;
            }

            previousNode = currentNode;
            currentNode = currentNode.next;
            currentIndex++;
        }

        System.out.println("Linked List index out of bounds");
    }
    
    public void print()
    {
        Node currentNode = head;
        while (currentNode != null) 
        {
            System.out.print(currentNode.value + (currentNode.next != null ? "->": ""));
            currentNode = currentNode.next;
        }
    }

    public void reverseIterative() 
    {
        Node currentNode = this.head;
        Node prevNode = null;
        Node nextNode;

        while (currentNode != null)
        {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }

        this.head = prevNode;
    }

    public static void main(String args[])
    {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.reverse();
        list.print();
        System.out.println("\nLL length = " + list.length());
    }
}
