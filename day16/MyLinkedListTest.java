package Java.month6.day16;

public class MyLinkedListTest {

}

class MyLinkedList<E>{
    Node<E> head=new Node<>();
    Node<E> end;
    int size;
    int size()
    {
        return size;
    }
    MyLinkedList(){
        head.next=null;
        end=head;
        size=0;
    }
    void add(E e){
        Node n=new Node();
        n.e=e;
        end.next=n;
        n.next=null;
        end=end.next;
        size++;
    }
    E get(int index)
    {
        Node temp=head;
        for(int i=0;i<=index;i++){
            temp=temp.next;
        }
        return (E) temp.e;
    }
}

class Node<E>
{
    E e;
    Node next;
}
