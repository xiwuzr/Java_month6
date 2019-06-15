package Java.month6.day15;

import java.io.*;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File f1=new File("E:\\a\\aaaa\\ccc","ss.java");
        FileInputStream is=new FileInputStream(f1);
//        int temp;
//        while((temp=is.read())!=-1)
//        {
//            System.out.print((char)temp);
//        }
//        is.close();
//        System.out.println("\n"+"///////////////////////");
        is=new FileInputStream(f1);
        byte[] tem=new byte[1024];
        int len=-1;

        File f2=new File("E:\\a\\aaaa\\ccc\\kk","xx.java");
        FileOutputStream os=new FileOutputStream(f2,true);

        while((len=is.read(tem))!=-1)
        {
//            String ss=new String(tem,0,len);
//            System.out.print(ss);
            os.write(tem,0,len);
        }

//        String src="IO IS SO EASY!";
        os.close();
        is.close();
    }

}
