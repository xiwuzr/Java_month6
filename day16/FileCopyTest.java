package Java.month6.day16;

import java.io.*;

public class FileCopyTest {
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\javaFileTest");
        File f2=new File("E:\\a");
        copy(f1,f2);
    }
    static void copy(File f1,File f2) throws IOException{
        f2=new File(f2,f1.getName());
        if(f1.isDirectory())
        {
            f2.mkdir();
            String[] fileName=f1.list();
            for(String temp:fileName){
                File ff=new File(f1,temp);
                copy(ff,f2);
            }
        }
        else
        {
            FileInputStream is=new FileInputStream(f1);
            FileOutputStream os=new FileOutputStream(f2);
            int len=-1;
            byte[] flush=new byte[1024];
            while((len=is.read(flush))!=-1)
            {
                os.write(flush,0,len);
            }
            os.close();
            is.close();
        }
    }

}


