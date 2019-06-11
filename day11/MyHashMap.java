package Java.month6.day11;

import java.util.LinkedList;

public class MyHashMap {
    public static void main(String[] args) {
        MyHash ss=new MyHash();
        ss.put("dd",99);
        ss.put("de",45);
        ss.put("hh",90);
        ss.put("de",55);
        System.out.println(ss.get("de"));
    }
}

class Entry{
    Object key;
    Object value;

    public Entry(Object key, Object value) {
        this.key = key;
        this.value = value;
    }
}
class MyHash
{
    MyHash()
    {
        size=0;
    }
    int size;
    int size()
    {
        return size;
    }
    MyLinkedList[] list=new MyLinkedList[99];
    void put(Object key,Object value)
    {
        int hash=key.hashCode()%99;
        Entry e=new Entry(key,value);
        if(list[hash]==null)
        {
            list[hash]=new MyLinkedList();
            list[hash].add(e);
            size++;
        }
        else{
            for(int i=0;i<list[hash].size();i++)
            {
                MyLinkedList tmp=list[hash];
                Entry ee=(Entry) tmp.get(i);
                if(ee.key.equals(key))
                {
                    ee.value=value;
                    return;
                }
            }
            list[hash].add(e);
            size++;
        }
    }
    Object get(Object key)
    {
        int hash=key.hashCode()%99;
        if(list[hash]!=null)
        {
            for(int i=0;i<list[hash].size();i++)
            {
                MyLinkedList tmp=list[hash];
                Entry ee=(Entry) tmp.get(i);
                if(ee.key.equals(key))
                {
                    return ee.value;
                }
            }
        }
            return null;
    }
}
