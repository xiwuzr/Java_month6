package Java.month6.day10;

public class HashTest {
    public static void main(String[] args) {
        Testss a=new Testss();
        a.name="hh";
        a.num=8;
        Testss b=new Testss();
        b.name="hh";
        b.num=8;
        System.out.println(a.hashCode());
        System.out.println(a.hashCode());

        System.out.println(b.equals(a));
        System.out.println("??????????");
        System.out.println(b.hashCode());
    }


}

class Testss
{
    int num;
    String name;
}