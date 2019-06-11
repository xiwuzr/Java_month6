package Java.month6.day3;

import java.util.ArrayList;
import java.util.Collection;

public class TestList {
    public static void main(String[] args) {
        TestList[] a=new TestList[4];
        System.out.println(a+"\n");
        int[] b=new int[5];
        System.out.println(b);
        Collection  co=new ArrayList();
        ((ArrayList)co).add(0,"xiaoxiao");
        co.add("huahua");
        System.out.println(co);
        System.out.println(co.size());
       // String dd="huaha";
        final char[]  dd=new char[]{'h','u','a','h','a'};
        co.add(dd);
        System.out.println(dd);
       // System.out.println(co.remove(dd));
        System.out.println(co);
        co.clear();
        System.out.println(co.size());

    }
}
