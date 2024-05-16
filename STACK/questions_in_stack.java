package STACK;

import java.util.Stack;

public class questions_in_stack {

// Question 1: push a number at the bottom of the stack
    public static void pushatBottom(Stack<Integer> s, int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushatBottom(s,data);
        s.push(top);
    }

// Question 2: reverse a String using stack

    public static String reverseString(String str)
    {
        Stack<Character> s=new Stack<>(); // using this stack to store data
        int idx=0;
        while (idx<str.length())  // while loop was using to store data in stack order
        {
            s.push(str.charAt(idx)); // store single alphabet in stack
            idx++;
        }
        StringBuilder result=new StringBuilder("");
        while (!s.isEmpty())
        {
            char current=s.pop();
            result.append(current);  //using append keyword to
        }
        str=result.toString();
        return str;
    }

//question 3: Reverse a stack using the same stack (without any new stack)

    public static void revresestack(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int top=s.pop();
        revresestack(s);
        pushatBottom(s,top);
    }

    public static void printing(Stack<Integer> s)
    {
        while (!s.isEmpty())
        {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {

//        question 1 commands
        /*
        question 1 commands

        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushatBottom(s,5);
        System.out.println(s);
        */

//        question 2 commands
        /*
                String str="abc";
        System.out.println(reverseString(str));
        */

//        question 3 commands
        /*
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        revresestack(s);
        printing(s);

         */
    }
}
