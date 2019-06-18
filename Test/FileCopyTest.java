package Java.month6.Test;
import java.io.*;
public class FileCopyTest  {
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\javaFileTest");
        File f2=new File("E:\\a");
        copy(f1,f2);

    }

    static void copy(File fF,File fS) throws IOException {
        fS=new File(fS,fF.getName());
        if(fF.isDirectory())
        {
            fS.mkdir();
            String[] fileName=fF.list();
            for(String temp:fileName){
                File f=new File(fF,temp);
                copy(f,fS);
            }
        }
        else
        {
            FileInputStream is=new FileInputStream(fF);
            FileOutputStream os=new FileOutputStream(fS);
            byte[] flush=new byte[1024];
            int len=-1;
            while((len=is.read(flush))!=-1)
            {
                os.write(flush,0,len);
            }
        }
    }
}
