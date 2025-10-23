package linkedList;

public class LinkedList {
    Node head;
    int length;

    LinkedList ()
    {
        this.head = null;
        this.length = 0;
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
            head = newNode;
        else
        {
            Node currentNode = head;
            while (currentNode.next != null)
                currentNode = currentNode.next;
            currentNode.next = newNode;
        }
        this.length++;
    }

    public void insertAtIndex(int value, int index)
    {
        if (index < 0)
            index = this.length + 1 + index;

        if (index <= this.length)
        {
            Node newNode = new Node(value);

            Node currentNode = head;
            int currentIndex = 0;
            while (currentNode != null)
            {
                if (index == 0)
                {
                    newNode.next = head;
                    head = newNode;
                    this.length++;
                    return;
                }
                
                if (currentIndex == index - 1)
                {
                    Node nextNode = currentNode.next;
                    currentNode.next = newNode;
                    newNode.next = nextNode;
                    this.length++;
                    return;
                }
                
                currentNode = currentNode.next;
                currentIndex++;
            }

            head = newNode;
        }
        else
        {
            System.out.println("Error: LinkedList index out of bounds");
        }
    }

    public void deleteAtIndex()
    {

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

    public static void main(String args[])
    {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.insertAtIndex(0, 0);
        list.insertAtIndex(2, 2);
        list.insertAtIndex(99, -1);
        list.insertAtIndex(98, -2);
        list.print();     
    }
}
