/*try the following methods
 *
 * get(pos) - get(2)
 * update(pos,val)
 * deleteAtEnd
 * insertAtEnd(val)
 * search(val) - return index, -1
 * contains(val) - return true or false
 * length
 *

 ***- means important code(point)

 */



package LinkedList.single_linked_list;

import java.util.Scanner;

/*
----some important point before staring LinkedList
1.we have to create a class to initialize LInked_list data & adders
2.we can create another class to add or delete or display the data
 */

// this below class point the "point number one"
class NODEs // WE CAN USE ANY NAME IN PLACE OF "NODE"
{
    int data; // we initialize a data (it store values)  & next( it stores values address)
    NODEs next;
    NODEs(int values) // we use construct to store the given values
    {
        data=values;
        next=null;
    }
}

class linked_list
{
    NODEs head;
    NODEs tail;
    int size; // it contains the size of the linked list


/*
            ADDING NUMBERS(VALUES)
            -- THERE ARE TWO TYPES TO ADDING NUMBERS
            1.ADD IN FIRST
            2.ADD IN LAST

*/
    // --***-- this below method was added values in front size (add first)
    public void add_in_first(int value)
    {
        NODEs newnode=new NODEs(value);
        size++;
        if(head==null)
        {
            head=tail=newnode;
        }
        else {
            newnode.next=head;
            head=newnode;
        }

    }
// --***-- this below method was added values in back size (add last)

    public void add_in_last(int value)
    {
        NODEs newnode=new NODEs(value);
        size++;
        if(head==null)
        {
            head=tail=newnode;
        }
        else {
            tail.next=newnode;
            tail=newnode;
        }
    }
// these methods add the values in the middle of the LinkedList
    public void index_position(int position,int value)
    {

        if(position==0)
        {
            add_in_first(value);
            return;
        }
        NODEs newnode=new NODEs(value);
        NODEs temp=head;
        size++;
        int i=0;
        while (i<position-1)
        {
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;

    }

//    -----------------------------------------------------------

    /*
            REMOVING VALUES IN LINKED LIST
            -- THERE ARE TWO TYPES OF REMOVING ELEMENTS IN LINKED LIST
            1.REMOVE IN FIRST
            2.REMOVE IN LAST

     */
    //------------------1.REMOVE IN FIRST-------------------------
    //  type1 to remove first number
        void remove_first_type1()
        {
             if(head.next==null)
            {
                head=null;
            }
             else if(head.next!=null)
             {
                 NODEs temp=head;
                 head=head.next;
                 temp.next=null;
             }
        }
    // TYPE 2 TO REMOVE FIRST NUMBER ------APNA COLLEGE  CODE---------
        public int remove_first_type2()
        {
            // IF LINKED LIST SIZE WAS ZERO, WE USE THIS
            if(size==0)
            {
                System.out.println("LINKED LIST IS EMPTY");
                return Integer.MIN_VALUE;
            }
            // IF THE LINKED LIST CONTAINS SINGLE DATA WE USE THIS
            else if(size==1)
            {
                int val=head.data;
                head=tail=null;
                size=0;
            }
            int val=head.data;
            head=head.next;
            size--;
            return val;
        }

    //---------------- 2.REMOVE IN LAST ----------------------------

    public int remove_last()
    {
        if(size==0)
        {
            System.out.println("LINKED LIST IS EMPTY");
            return Integer.MIN_VALUE;

        }
        else if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        NODEs prev=head;
        for(int i=0;i<size-2;i++)
        {
            prev=prev.next;
        }
        int value=prev.next.data; // tail.data(LAST node data)
        prev.next=null;
        tail=prev;
        size--;
        return value;
    }

// searching a number or target in a linked list(iterative)

    public int search(int target) // O(n) - we used linear search
    {
        NODEs temp=head;
        while (temp!=null)
        {
            if(temp.data==target)
            {
                return target;
            }
            temp=temp.next;

        }
        return -1;
    }

/* using recursion in the linked list (for searching)
    - we want two methods to do recursion in linked list
        -> create a method to get values(target) from the main class and pass the values(target) and head to the second method to get answer
 */

//    question -> check target was present in a linked list then return its index number or return -1?
           public int recursion_first(int target) // we use the method for simply sending head and key values to actual recursion method
           {
               return recursion_second(head,target);
           }
           public int recursion_second(NODEs head,int target) // this method was the actual recursion function
           {
               if(head==null)
               {
                   return -1;
               }
               if(head.data==target)
               {
                   return target;
               }
               // this line was the recursion code(part)
               int idx=recursion_second(head.next,target);
               if(idx==-1)
               {
                   return -1;
               }
               return idx+1;
           }
    public void display()
    {
        NODEs temp=head;
        while (temp!=null)
        {
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
    }





}

public class single_linkedlist {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        linked_list ll=new linked_list();
        int i=0;
        while (i<3)
        {

//            ll.add_in_first(input.nextInt()); // it adds the front side
            ll.add_in_last(input.nextInt()); // it adds back size
            i++;
        }
//        ll.index_position(0,5);

//        ll.remove_first_type2();
//        ll.remove_last();

//        ll.display();
        System.out.println(ll.recursion_first(2));
//        System.out.println(ll.size);
    }
}
