package Java.month6.day16;

//import java.util.LinkedList;


import java.util.HashMap;

public class HashTest {
    public static void main(String[] args) {
        Hash<String,Integer> st=new Hash<>();
        st.put("hu",123);
        st.put("li",321);
        st.put("www",234);
        st.put("li",0);
        System.out.println(st.size());
        System.out.println(st.get("li"));
        HashMap a;
    }
}

class Hash<K,V>{
    private int size;

    public int size() {
        return size;
    }

    Hash()
    {
        size=0;
    }

    MyLinkedList<Entry>[] list=new MyLinkedList[99];

    void put(K key,V value){
        Entry e=new Entry(key,value);
        int a=key.hashCode()%99;
        if(list[a]==null){
            list[a]=new MyLinkedList<>();
            list[a].add(e);
            size++;
        }
        else
        {
            for(int i=0;i<list[a].size();i++)
            {
                Entry temp=list[a].get(i);
                if(temp.key==key){
                    temp.value=value;
                    return;
                }
            }
            list[a].add(e);
        }
    }

    V get(K key){
        int a=key.hashCode()%99;
        for(int i=0;i<list[a].size();i++)
        {
            Entry temp=list[a].get(i);
            if(temp.key==key){
                return (V)temp.value;
            }
        }
        return null;
    }
}

class Entry<K,V>
{
    K key;
    V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
