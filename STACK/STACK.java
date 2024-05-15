package STACK;

public class STACK {
    public int arr[]=new int[4];
    public int top=-1;


    void push(int data)
    {
        if(top<arr.length-1)
        {
            arr[++top]=data;
        }
    }

    void pop()
    {
        if(top>-1)
        {
            top--;
        }
    }

    void index_pop(int index)
    {
        if(index<0 || index>top)
        {
            throw new IndexOutOfBoundsException("there was no data");
        }
       for (int i=index;i<=top;i++)
       {
           arr[i]=arr[i+1];
       }
       top--;
    }

    void display()
    {

        for (int i=0;i<=top;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        STACK ss=new STACK();
        ss.push(1);
        ss.push(2);
        ss.push(3);
        ss.push(4);
        ss.display();
        System.out.println();
        ss.pop();
//        ss.display();;

        ss.index_pop(4);
        ss.display();


    }
}
