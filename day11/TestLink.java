package Java.month6.day11;

public class TestLink {
    public static void main(String[] args) {
        MyLinkedList ss=new MyLinkedList();
        ss.add("ccc");
        ss.add(123);
        ss.del(1);
        System.out.println(ss.size());

    }
}
class MyLinkedList
{
    int size;
    int size(){
        return size;
    }
    Node end=null;
    Node first=null;
    void add(Object e)
    {
        if(size==0)
        {
            first=new Node();
            first.e=e;
            first.next=null;
            end=first;
            size++;
        }
        else if(size==1)
        {
            first.next=new Node();
            end=first.next;
            first.next.next=null;
            first.next.e=e;
            size++;
        }
        else
        {
            end=new Node();
            end.e=e;
            end.next=null;
            end=end.next;
            size++;
        }
    }
    void clear()
    {
        first=null;
    }
    void del(int index)
    {
        if(index==0)
        {
            first=first.next;
            size--;
            return;
        }
        if(index==1)
        {
            size--;
            first.next=first.next.next;
            return;
        }
        Node tmp=first;
        for(int i=1;i<index;i++)
        {
            tmp=tmp.next;
        }
        tmp=tmp.next.next;
        size--;
        return;

    }
    Object get(int index)
    {
        if(index>=size)
        {
            return null;
        }
        Node tmp=first;
        for(int i=0;i<index;i++)
        {
            tmp=tmp.next;
        }
        return tmp.e;
    }
}

class Node
{
    Object e;
    Node next;
}
