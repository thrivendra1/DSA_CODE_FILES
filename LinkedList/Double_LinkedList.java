package LinkedList;


import com.sun.jdi.Value;

import javax.xml.crypto.dsig.keyinfo.KeyName;
import java.util.Stack;

class  Node
{
    int data;
    Node next;
    Node back;
    Node(int data)
    {
        this.data=data;
        this.next=null;
        this .back=null;
    }
}


public class Double_LinkedList {
    public static void main(String[] args) {
        int[] arr = {2,5,8,9};
        Node head = converting(arr);    //convert Array to LinkedList


        //----------------------------------------Deleting --------------------------------------------
//        Node head1 = head_deleting(head);
//        Node head2=tail_deleting(head);
//        Node head3=delete_k_element(head,2);
//        Node head4 = deleting_a_target_number(head, 9);


        //------------------------------------Insertion----------------------------------------
//        Node headI1=fornt_of_head(head,1);
//        Node headI2=end_of_head(head,10);
//          Node headI3=K_index(head,2,6);
//        Node headI4=insertBeforetarget(head,4,5);
          Node headI5=reversing(head);
        Travesrl(headI5);
    }

//---------------------------------------convert Array to LinkedList----------------------------------------------

    static private Node converting(int[] arr) {
        if(arr.length==0)
        {
            return null;
        }
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            Node value = new Node(arr[i]);
            temp.next = value;
            value.back = temp;  //// Setting the previous reference
            temp = value;
        }
        return head;
    }

    //---------------------------------------Traversal the LinkedList----------------------------------------------
    static private void Travesrl(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    //-> 1.------------------------------- deleting the Head node & assign, next node was head-----------------------------

    static private Node head_deleting(Node head) {

        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        head = head.next;
        head.back = null;
        temp.next = null;
        return head;
//        if(head==null) return null;f
//        Node temp=head.next;
//        if (temp!=null)
//        {
//            temp.back=null;
//        }
//        return temp;
    }

//-> 2.------------------------------- deleting the Tail of the LinkedList---------------------------------------

    static private Node tail_deleting(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next.back = null;
        temp.next = null;


        return head;
    }

//-> 3.------------------------------- deleting a K index element in LinkedList---------------------------------------

    static private Node delete_k_element(Node head, int k_element) {
        int count = 0;
        Node KNode = head;
        // we are finding k_element Node
        while (KNode != null) {
            count++;
            if (count == k_element) {
                break;
            }

            KNode = KNode.next;
        }

        // we got our K_element Node and assigning the K_element Node "back and next" address to another new Node
        Node previous = KNode.back;
        Node front = KNode.next;

        // we are checking the Node has one element or more

        if (previous == null && front == null) // if the Node does not have any node, return null
        {
            return null;
        }
        else if (previous == null) // if the "previous" keyword was null,it indicates we are in the "head" Node than we can delete head;
        {
            return head_deleting(head);  //  we write a function to delete head Node

        } else if (front == null) // if "Front" was null, it indicates we are in the last Node of the Double_Linked list
        {
            return tail_deleting(head); //  we write a function to delete Tail Node

        }

        // if the "KNode" was in the middle of the Node(Double_Linked list) this below code was work

        previous.next = front;
        front.back = previous;
        return head;
    }


//-> 4.------------------------------- deleting a Deleting_a_target_number  in LinkedList---------------------------------------

    static private Node deleting_a_target_number(Node head, int target) {
        Node targetNode = head;
        // we are finding target Node Node
        while (targetNode != null) {
            if (targetNode.data == target) {
                break;
            }

            targetNode = targetNode.next;
        }

        // we got our targetNode Node and assigning the targetNode Node "back and next" address to another new Node
        Node previous = targetNode.back;
        Node front = targetNode.next;

        // we are checking the Node has one element or more

        if (previous == null && front == null) // if the Node does not have any node, return null
        {
            return null;
        } else if (previous == null) // if the "previous" keyword was null,it indicates we are in the "head" Node than we can delete head;
        {
            return head_deleting(head);  //  we write a function to delete head Node

        } else if (front == null) // if "Front" was null, it indicates we are in the last Node of the Double_Linked list
        {
            return tail_deleting(head); //  we write a function to delete Tail Node

        }

        // if the "targetNode" was in the middle of the Node(Double_Linked list) this below code was work

        previous.next = front;
        front.back = previous;
        return head;
    }
    //
    ///
    //
    //
    //
//-----------------------------------------------Insertion--------------------------------------------------//

    //-> 1.------------------------------- Insertion a number in front of head-----------------------------


    static public Node fornt_of_head(Node head, int number)
    {
        if(head==null)
        {
            Node Newhead=new Node(number);
            head=Newhead;
            return head;
        }
        Node Newhead=new Node(number);// we're creating a new object for Node and string the number
        Newhead.next = head;
        head.back=Newhead;
        Newhead.back=null;
        return Newhead;


    }

    //-> 2.------------------------------- Insertion a number in the "Tail" of the LinkedList-----------------------------

    static public Node end_of_head(Node head,int number)
    {
        if(head==null)
        {
            return fornt_of_head(head,number);
        }
        Node tail=head;
        while (tail.next!=null)
        {
            tail=tail.next;
        }
        Node value=new Node(number);
        tail.next=value;
        value.back=tail;
        value.next=null;

        return head;
    }

    //-> 3.------------------------------- adding a number in given index-----------------------------
    static public Node K_index (Node head,int k_index,int number)
    {
        if(head==null || k_index==1)
        {
            return fornt_of_head(head,number);
        }

        // getting k_index Node
        Node k_Node=head;
        int count=0;
        while (k_Node!=null)
        {

            if(count==k_index)
            {
                break;
            }
            count++;
            k_Node=k_Node.next;
        }
        System.out.println(k_Node.data);

        // we got our k_index Node
        Node previous=k_Node.back;
        Node front=k_Node.next;
        if(previous==null && front==null)
        {
            return null;
        }
        else if(previous==null)
        {
            return fornt_of_head(head,number);
        }
        else if(front==null)
        {
            return end_of_head(head,number);
        }



        // Insertion at the middle
        Node newNode=new Node(number);   // creating a New Node to store given number


        newNode.back=k_Node.back;
        newNode.next=k_Node;

        k_Node.back.next=newNode;
        k_Node.back=newNode;

        return head;
    }

    //-> 4.------------------------------- adding a number in before the target-----------------------------

    static public Node insertBeforetarget(Node head,int number,int target)
    {
        if(head==null )
        {
            return fornt_of_head(head,number);
        }

        Node kNodetarget=head;
        while (kNodetarget!=null)
        {
            if(kNodetarget.data==target)
            {
                break;
            }
            kNodetarget=kNodetarget.next;
        }

        Node previous=kNodetarget.back;
        Node front=kNodetarget.next;

        if(previous==null && front==null)
        {
            return null;
        }
        else if(previous==null)
        {
            return fornt_of_head(head,number);
        }
        else if(front==null)
        {
            return end_of_head(head,number);
        }

        Node newNode=new Node(number);
        newNode.back=kNodetarget.back;
        newNode.next=kNodetarget;

        kNodetarget.back.next=newNode;
        kNodetarget.back=newNode;
        return head;
    }

    static public Node reversing(Node head)
    {

        /*
        Apporach -> 1  -- we used stack to store the linked list values and store the stack data into linked list

        // step - 1--T/C-O(n)

         if(head==null || head.next==null)
        {
            return head;
        }
        Stack<Integer> list=new Stack<>();
        Node temp=head;
        while (temp!=null)
        {
            list.push(temp.data);
            temp=temp.next;
        }

//        step- 2 T/C-O(n)

        int number;
        temp=head;
        while (temp!=null)
        {
//             number=list.pop();
            temp.data=list.pop();
            temp=temp.next;
        }
        return head;

//        Time complexity-> O(n)+O(n)=O(2n)
//          space complexity-o(n)
         */

//        Approach-> 2 -- we are swapping the direction of the DLL

        if(head==null || head.next==null)
        {
            return head;
        }
        Node previous=null;
        Node current=head;

        while(current!=null)
        {
            previous=current.back;

            current.back=current.next;

            current.next=previous;
            current=current.back;
        }
        return previous.back;

    }
}


