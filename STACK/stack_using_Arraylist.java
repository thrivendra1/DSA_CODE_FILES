package STACK;

import java.util.ArrayList;
import java.util.Scanner;

public class stack_using_Arraylist {
   static ArrayList<Integer> list=new ArrayList<>();

    // opertions
    public  boolean isEmpty()
    {
        return list.size()==0;
    }

    // push

    public void push(int data)
    {
        list.add(data);
    }
    //pop()

    public int pop()
    {
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    // peek()

    public int peek()
    {
        return list.get((list.size()-1));
    }

    public void display()
    {
     System.out.println(list);
    }

    public static void main(String[] args) {
        stack_using_Arraylist s=new stack_using_Arraylist();
        Scanner input=new Scanner(System.in);
        System.out.println("enter your size");
        int size=input.nextInt();
        int i=0;
        while (i<size)
        {
            int number=input.nextInt();
            s.push(number);
            i++;
        }
        s.isEmpty();
    }
}
