package Java.month6.day13;
import java.util.*;
public class MyHash01 {
    public static void main(String[] args) {
        MyHashMap<String,Integer> stu=new MyHashMap<>();
        System.out.println(stu.size());
        stu.put("hh",52);
        stu.put("jj",87);
        stu.put("ll",99);
        System.out.println(stu.get("jj"));
        System.out.println(stu.size());
        HashMap<String,Integer> map=new HashMap<>();

        map.put("jj",87);
        map.put("hh",52);
        map.put("ll",99);
        System.out.println(map);
        System.out.println(map.toString());
    }
}

class MyHashMap<T,V>{
    private int size;
    public int size(){
        return size;
    }
    LinkedList<Entor>[] map=new LinkedList[99];
    public MyHashMap() {
        size=0;
    }
    void put(T key,V value)
    {
        Entor<T,V> e=new Entor<>(key,value);
        int h=key.hashCode()%99;
        if(map[h]==null)
        {
            map[h]=new LinkedList<>();
            map[h].add(e);
            size++;
        }
        else
        {
            Entor<T,V> temp;
            for(int i=0;i<map[h].size();i++)
            {
                temp=map[h].get(i);
                if(temp.key==key)
                {
                    temp.value=value;
                    return;
                }
                map[h].add(e);
                size++;
            }
        }
    }
    public V get(T key){
        int h=key.hashCode()%99;
        Entor<T,V> temp;
        for(int i=0;i<map[h].size();i++)
        {
            temp=map[h].get(i);
            if(temp.key==key)
            {
                return temp.value;
            }
        }
        return null;
    }
}

class Entor<T,V>
{
    T key;
    V value;

    public Entor(T key, V value) {
        this.key = key;
        this.value = value;
    }
}
