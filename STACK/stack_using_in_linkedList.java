package STACK;

public class stack_using_in_linkedList {

    static class Node
    {
        int data;
        Node next;
        Node(int values) {
            data = values;
            next = null;
        }
    }

    static class stack
    {
       static Node head=null;

       // checking the LinkedIn was empty or not
       public static boolean isEmpty()
       {
            return head==null;
       }


       // adding number
       public static void push(int value)
       {
           Node newnode=new Node(value);
           if(isEmpty())
           {
               head=newnode;
           }
           else
           {
               newnode.next=head;
               head=newnode;
           }
       }


       // removing a number in the linked list
       public static int pop()
       {
           if(isEmpty())
           {
               return -1;
           }
           int top=head.data;
           head=head.next;
           return top;
       }

       public int peek()
       {
           if(isEmpty())
           {
               return -1;
           }
           return head.data;
       }

       void display()
       {
           Node temp=head;
           while (temp!=null)
           {
               System.out.println(temp.data);
               temp=temp.next;
           }
       }

    }

    public static void main(String[] args) {
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
//        s.display();
//        s.pop();
        System.out.println("-------------------------------------------");
        System.out.println(s.peek());
//        s.display();
    }

}
