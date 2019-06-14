package Java.month6.day14;

import java.io.*;

public class FileReadTest {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\javaFileTest","ss.txt");
        FileInputStream is=new FileInputStream(file);
        int temp;
        int i=5;
        while((temp=is.read())!=-1)
        {
            ;
            System.out.print((char)temp);
        }
        is.close();
        System.out.println("\n"+"////////////////////");
        is=new FileInputStream(file);
        byte[] flush=new byte[6];
        int len=-1;
        while((len=is.read(flush))!=-1){
            String a=new String(flush,0,len);
            System.out.print(a);
        }

    }
}
