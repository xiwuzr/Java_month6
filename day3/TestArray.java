package Java.month6.day3;

import java.util.Scanner;

public class TestArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //sc.useDelimiter(" ");
        int[] a=new int[5];
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        int cc=sc.nextInt();
        System.out.println("***************");
        for(int i:a){
            System.out.print(i);
        }
        System.out.println(a.toString()+"           hhhhh");
        System.out.println(cc);

    }
}

