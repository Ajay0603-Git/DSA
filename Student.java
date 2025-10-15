

    
    class Node {
        int marks;
        String Name;
        int Rollno;
        Node next;

        Node(int marks,String Name,int Rollno) {
            this.marks = marks;
            this.Name=Name;
            this.Rollno=Rollno;
            this.next = null;
        }
    }
class LinkedList
{
    int size=0;
    Node head;

    public void add(int marks,String Name,int Rollno)
    {
        Node n1=new Node(marks,Name,Rollno);
        size++;
        if(head==null)
        {
            head=n1;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
            temp.next=n1;
    }
    public void show()
    {
        if (head==null)
        {
            System.out.print("linked list is empty");
            return;
        }
        Node temp=head;
        System.out.print("linked list is:");
        while(temp!=null)
        {
            System.out.println("marks"+temp.marks);
            System.out.println("NAme"+temp.Name);
            System.out.println("Rollno"+temp.Rollno);
            System.out.println("->");
            temp=temp.next;
        }
        System.out.print("Null");
        
    }

    }


    public class Student
    {
        public static void main(String s[])
        {
            LinkedList l1=new LinkedList();
            l1.show();
            l1.add(100,"Ramesh",1);
            l1.add(101,"Ram",2);
            l1.add(102,"Ramu",3);
            l1.show();




        }
    }
