package Java.month6.day3;

import java.util.Date;

public class TestDay {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);
        System.out.print(args.length);
        for(String a:args){
            System.out.print(a);
            System.out.print("*");
        }

    }
}
