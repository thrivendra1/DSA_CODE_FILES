package LinkedList;

public class Linkedlists {

    public static void main(String[] args) {
        int arr[]={2,5,8,9};

//------------------------- converting an array to a linked list -------------------------
       Node head= convertArraytoLL(arr);


       // Finding target
//        serach(head,8);

//-------------------------------- Traversal the LinkedList ---------------------------------------
        //   TraversalLinkedlist(head);

//----------------------------------------Deleting --------------------------------------------
         //  Node delte= delteinghead(head);   // head deleting

//        Node Tail=delteingTail(head);         // tail was deleting

//        TraversalLinkedlist(Tail);

//        Node K=Kelement(head,1); // removing a number with the help of index


//        Node Nu=Deltering_a_number(head,5); // removing a number


        //----------------------------------------Insertion --------------------------------------------

        /*

//        Node N=fornt_of_head(head,1); // adding a number in front of head


//        Node Last=end_of_head(head,10);     // adding a number in Tail of head



// adding a number in given index-----------------------------------
        int number=7,index=2;
        Node k=indexelement(head,number,index);
        TraversalLinkedlist(k);

 */

        // adding a number before the target

        Node before=insertBeforetarget(head,10,5);
        TraversalLinkedlist(before);




    }


//-------------------------creating an own data type for to storing LinkedList -> data & next data address-------------------------------------

    static class Node
    {
        int data;
        Node next;

        // creating constructor to store the  data to Node

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
//---------------------------------------Traversal the LinkedList----------------------------------------------

    private static void TraversalLinkedlist(Node head)
    {
        int size=0; // count the size of the linkedList

        Node temp=head;
        while (temp!=null)
        {
            size++; // count the size of the linekdList
            System.out.println(temp.data);
            temp=temp.next;
        }
        // Search element in an LinkedList


    }


    //---------------------------------------convert Array to LinkedList----------------------------------------------

    static public Node convertArraytoLL(int[] arr)
    {
        // storing first number was Head
        Node head=new Node(arr[0]);

        Node mover=head; // we're using mover has variable to moving from each number;

        for(int i=1;i<arr.length;i++)
        {
            Node temp=new Node(arr[i]); // we're storing the next number in temp than store it address to head next
            mover.next=temp; // we're storing address
            mover=temp;  // we're moving "mover" to the next number;
        }
        return head;

    }

    //---------------------------------------search a target in  LinkedList----------------------------------------------


    static public int serach(Node head,int targert)
    {
        Node temp=head;

        while(temp!=null)
        {
            if(targert==temp.data)
            {
//                return temp.data;
                return 1;
            }
            temp=temp.next;
        }
        return -1;
    }


    //
    //
    //
    //

    //-> 1.------------------------------- deleting the Head node & assign, next node was head-----------------------------


    static  public Node delteinghead(Node head)
    {
        if(head==null) return head;
        head=head.next;
        return head;
    }

    //-> 2.------------------------------- deleting the Tail of the LinkedList---------------------------------------

    static public Node delteingTail(Node head)
    {
        if(head==null || head.next==null) return null;

        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    //-> 3.------------------------------- deleting a K index element in LinkedList---------------------------------------

    static public Node Kelement(Node head,int k)
    {
        if(head==null) return head;
        int count=0;
        int num=head.data;
        Node temp=head;
        while (temp.next!=null)
        {

            if(count==k)
            {
                temp.data=temp.next.data;
                temp.next=temp.next.next;
                break;
            }
            count++;
            temp=temp.next;
        }
        return head;
    }


    //-> 3.------------------------------- deleting a K index element in LinkedList---------------------------------------

    static public Node Deltering_a_number(Node head,int k)
    {
        if(head==null) return head;
        int count=0;
        int num=head.data;
        Node temp=head;
        while (temp.next!=null)
        {

            if(temp.data==k)
            {
                temp.data=temp.next.data;
                temp.next=temp.next.next;
                break;
            }
            count++;
            temp=temp.next;
        }
        return head;
    }



    ///
    ///
    ///
    //-> 1.------------------------------- Insertion a number in front of head-----------------------------


    static public Node fornt_of_head(Node head,int number)
    {
        Node temp =new Node(number); // we're creating a new object for Node and string the number
        temp.next=head;
        return temp;

    }

    //-> 2.------------------------------- Insertion a number in end of head-----------------------------
    static public Node end_of_head(Node head,int number)
    {
        Node temp=head;
        while (temp.next!=null)
        {
            temp=temp.next;
        }
        Node value=new Node(number);
        temp.next=value;

        return head;
    }

    //-> 3.------------------------------- adding a number in given index-----------------------------
    static public Node indexelement(Node head,int number,int index)
    {
        int count=0;
        Node temp=head;
        while (temp.next!=null)
        {
            if(count==index-1)
            {
                Node value=new Node(number);
                value.next=temp.next;
                temp.next=value;
                break;
            }
            temp=temp.next;
            count++;
        }
        return head;
    }

    //-> 4.------------------------------- adding a number in given index-----------------------------


    static public Node insertBeforetarget(Node head,int number,int target)
    {

        Node temp=head;
        while (temp.next!=null)
        {
            if(temp.next.data==target)
            {
                Node value=new Node(number);
                value.next=temp.next;
                temp.next=value;
                break;
            }
            temp=temp.next;

        }
        return head;
    }
}
