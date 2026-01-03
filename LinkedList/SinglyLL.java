public class SinglyLL<T> 
{
    
    Node head;
    private int size;
    SinglyLL()
    {
        size=0;
    }

    class Node
    {
        T data;
        Node next;

        Node(T data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
    }
    
    // add from first
    public void addFirst(T data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    // add from Last
    public void addLast(T data)
    {
        Node newNode=new Node(data); 
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node crrNode=head;
        while(crrNode.next!=null)
        {
            crrNode=crrNode.next;
        }

        crrNode.next=newNode;
    }

    //Delete from First
    public T removeFirst()
    {
        if(head == null)
        {
            System.out.println("List is Empty");
            return null;
        }
        T x=head.data;
        head=head.next;
        size--;
        return x;
    }

    //Delete from Ending
    public T removeLast()
    {
       if(head == null)
        {
            System.out.println("List is Empty");
            return null;
        }
        size--;
        Node currNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        T x=currNode.data;
        currNode.next=null;
        return x;
    }


    //print size 
    public int size()
    {
        return size;
    }

    //print list
    public String toString()
    {
        Node node=head;
        String s="[";
        while(node!=null)
        {
            s=s+node.data; if(node.next!=null)s+=", ";
            node=node.next;
        }
        s+="]";
        return s;
    }
    public static void main(String[] args) {
        SinglyLL<Object> sll=new SinglyLL<>();
        sll.addFirst("a");
        sll.addFirst("b");
        sll.addLast("c");
        sll.addFirst("d");
        sll.addLast("e");

        System.out.println(sll);
        System.out.println(sll.removeFirst());
        System.out.println(sll.removeLast());

        System.out.println(sll);
        System.out.println("size = "+sll.size());
    }
}
