package Java.month6.Test;

public class Demo_2 {
    public static void main(String[] args) {
        String str = "a";
        change(str);
        String str2 = new String("a");
        change2(str2);

        System.out.println(str == str2);//false
        System.out.println(str.equals(str2));//true
        System.out.println(str+""+str2);
    }

    public static void change(String str) {
        str += "b";
    }

    public static void change2(String str) {
        str = "ab";
    }
}

class A {
    public void run(A a) {
        System.out.println(a.out());
    }

    public String out() {
        return "这是A";
    }
}

class B extends A{

    public void run(A a) {
        System.out.println(a.out() + "---B");
    }

    public String out() {
        return "这是B";
    }
}

class C extends B {
    public String out() {
        return "这是C";
    }
}

class D extends A {

}

 class Demo_1 {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new B();
        A a2 = new C();

        B b = new B();
        B b1 = new C();

        a.run(a1);// 这是B
        a.run(a2);// 这是C
        a1.run(b);//这是B---B

        b.run(a);//这是A---B
        b.run(b1);//这是c---B

        D d = new D();
        d.run(a);//这是A
    }
}
