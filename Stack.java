class Stack
{
    int maxsize;
    int StackArray[];
    int top;

    Stack(int size)
    {
        maxsize=size;
        StackArray=new int[5];
        top=-1;
    }

    public void push(int value)
    {
        if(top==maxsize-1)
        {
            System.out.println("Stack is Overflow");
        }
        else
        {
            StackArray[++top]=value;
            System.out.println("The pushed elements are :"+value);
        }
    }

    public int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow"+"\t");
            return -1;
        }
        else
        {
            System.out.println("poped elements are:"+StackArray[top]);
            return StackArray[top--];
        }
    }

    void peek()
    {
        System.out.println("Peek elements:"+StackArray[top]);

    }

    void display()
    {
        for(int i=0;i<=top;i++)
        {
             System.out.print("Stack Elements are:"+StackArray[i]+"\t");
        }
    }

    void isEmpty()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
        }
    }

    void isFull()
    {
        if(top==maxsize-1)
        {
            System.out.println("Stack is Full");
        }
    }

    


}
    class StackDemo
    {
        public static void main(String s[])
        {
            Stack S1=new Stack(5);
            S1.push(10);
            S1.push(20);
            S1.push(30);
            S1.push(40);
            S1.push(50);

            S1.pop();
            S1.pop();

            

            S1.pop();
            S1.pop();

            S1.peek();

            S1.display();
            S1.isEmpty();
            S1.isFull();
        }
    }
