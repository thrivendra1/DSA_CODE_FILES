package LinkedList;

import java.util.Scanner;


///////////////------------------------Adding_number_in_doubly_linked_list------------------------

class  Node_DLl
{
    int data;
    Node_DLl next;
    Node_DLl back;
    Node_DLl(int data)
    {
        this.data=data;
        this.next=null;
        this .back=null;
    }
}
public class DLL {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        DLL list=new DLL();

        for (int i=0;i<5;i++)
        {
            int number=input.nextInt();
            list.add(number);
        }
        //printing
        list.printing();
    }

    public static Node_DLl head;
    public static Node_DLl tail;

    static public void add(int number) {
        Node_DLl value = new Node_DLl(number);
        if (head == null) {
            head = value;
            tail = value;
        } else {
            tail.next = value;
            value.back = tail;
            tail = value;
        }

    }

    static public void printing() {
        Node_DLl temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
