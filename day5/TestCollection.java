package Java.month6.day5;

import java.util.*;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList<String>col=new ArrayList<>();
        col.add("wangwang");
        col.add("mingming");
        col.add("huanghuang");
        System.out.println(col);
        Collection<String>cc=new ArrayList<>();
        cc.add("wangwang");
        //col.retainAll(cc);
        //col.removeAll(cc);
        System.out.println(col);
        System.out.println(cc);
        col=(ArrayList)col;

        System.out.println(col.get(2));






    }
}
