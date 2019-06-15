package Java.month6.day15;
import java.io.*;

public class FileCopyTest01 {
    public static void main(String[] args) throws IOException {
        copyF aa=new copyF("D:\\javaFileTest","E:\\a");
    }

}

class copyF{
    String pathF;
    String pathS;
    File fF;
    File fS;

    public copyF(String pathF, String pathS) throws IOException{
        this.pathF = pathF;
        this.pathS = pathS;
        fF=new File(pathF);
        fS=new File(pathS);
        copy(fF,fS);
    }
    void copy(File f1,File f2)throws IOException
    {
        if(f1.isDirectory())
        {
            String name=f1.getName();
            f2=new File(f2,name);
            f2.mkdir();
            String[] fileName=f1.list();
            for(String temp:fileName)
            {
                File f=new File(f1,temp);
                copy(f,f2);
            }
        }
        else
        {
            String name=f1.getName();
            f2=new File(f2,name);
            FileInputStream is=new FileInputStream(f1);
            FileOutputStream os=new FileOutputStream(f2);
            byte[] flush=new byte[1024];
            int len=-1;
            while((len=is.read(flush))!=-1){
                os.write(flush,0,len);
            }
            os.close();
            is.close();
        }
    }
}
