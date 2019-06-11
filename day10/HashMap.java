package Java.month6.day10;

import java.util.LinkedList;

public class HashMap {
    public static void main(String[] args) {
        MyHashMap greads=new MyHashMap();
        stt aa=new stt();
        aa.name="HHHHH";
        aa.num=88;
        String aaaa="LiNing";
        greads.put("Xx",156);
        greads.put("LiNig",aa);
        greads.put("aa",112);
        greads.put("Gg",100);
        greads.put("aa",115);

        System.out.println((int)greads.get("aa"));
        System.out.println(greads.size);
    }
}

class MyHashMap
{
    MyHashMap()
    {
        size=0;
    }
    LinkedList[] list =new LinkedList[99];
    int size;
    public void  put(Object key,Object value)
    {
        Entry e=new Entry(key,value);
        int a=key.hashCode()%99;
        if ( list[ a ] == null )
        {
            list[a]=new LinkedList();
            list[a].add(e);
        }
        else
        {
            for(int i=0;i<list[a].size();i++)
            {
                Entry t=(Entry) list[a].get(i);
                if(t.key==key)
                {
                    t.value=value;
                    return;
                }

            }
            list[a].add(e);
        }
        size++;
    }

    public Object get(Object key)
    {
        int a=key.hashCode()%99;
        LinkedList tmp= list[a];
        for(int i=0;i<tmp.size();i++)
        {
            Entry e=(Entry) tmp.get(i);
            if(e.key==key)
            {
                return e.value;
            }
        }
        return null;
    }
}
class Entry
{
    Object key;
    Object value;
    public Entry(Object key,Object value)
    {
        this.key=key;
        this.value=value;
    }
    public Entry()
    {
    }
}
class stt
{
    int num;
    String name;
}

