package LinkedList;

// creating a node

class Node{ // we can assign any name IN NODE place example like (class ll or class data, class thrive) like this

    int data;  // giving data , data type data name
    Node next; // this was to assign the reference of the data

    // creating a construct to store this data
    Node(int data)
    {
        this.data=data;
    }
}

class  Linkedlist
{
    Node head; // we create a local variable to store stating node value reference
     void printlinkedlist()
    {
        Node current=head; // we store head in a new node called current

        // we are checking
        while (current!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }
    }
}

public class creating_a_linkedlist {


    public static void main(String[] args) {

        // we're adding the data in to the linked node
        Node p1=new Node(10);
        Node p2=new Node(20);
        Node p3=new Node(30);

        // we're assigning the next values reference to previous values node
        p1.next=p2;
        p2.next=p3;
//        Node head=p1;


        // we created a new class to print this values
        Linkedlist ll=new Linkedlist();
        ll.head=p1;
        ll.printlinkedlist();
    }


}
