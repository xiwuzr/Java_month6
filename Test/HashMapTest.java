package Java.month6.Test;

import java.util.LinkedList;

public class HashMapTest {
    public static void main(String[] args) {
        MyHashMap map=new MyHashMap();
        map.put("hh",123);
        map.put("mm",321);
        map.put("ff",678);
        map.put("mm",666);
        System.out.println(map.get("mm"));
        System.out.println(map.size());
    }

}

class MyHashMap<K,V>{
    private int size;
    int n=10;
    LinkedList<Node>[] list=new LinkedList[n];

    public MyHashMap()
    {
        this.size = 0;
    }

    public int size() {
        return size;
    }

    void put(K key,V value)
    {
        if(size>=n*0.8)
        {
            over(list);
        }
        Node e=new Node(key,value);
        int a=key.hashCode()%n;
        if(list[a]==null){
            list[a]=new LinkedList();
            list[a].add(e);
            size++;
        }
        else
        {
            Node temp;
            for(int i=0;i<list[a].size();i++)
            {
                temp=list[a].get(i);
                if(temp.key==key)
                {
                    temp.value=value;
                    return;
                }
            }
            list[a].add(e);
            size++;
        }
    }
   void over(LinkedList[] list)
    {
        n*=2;
        LinkedList<Node>[] aa=new LinkedList[n];
        LinkedList<Node>[] temp=list;
        list=aa;
        for(int i=0;i<n/2;i++)
        {
            if(temp[i]==null)
                continue;
            for(int j=0;j<temp[i].size();j++)
            {
                Node tem=(Node)temp[i].get(j);
                put((K)tem.key,(V)tem.value);
            }
        }


    }

//    private void put(Object key, Object value) {
//    }

    V get(K key)
    {
        int a=key.hashCode()%n;
        Node temp;
        for(int i=0;i<list[a].size();i++){
            temp=list[a].get(i);
            if(temp.key==key)
            {
                return (V)temp.value;
            }
        }
        return null;
    }
}
class Node<K,V>
{
    K key;
    V value;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

