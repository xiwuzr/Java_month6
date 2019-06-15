package Java.month6.day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
    public static void main(String[] args) throws IOException {

        Copy cc=new Copy("D:\\javaFileTest\\aaaa\\cccccccccccccc\\184991.jpg","D:\\javaFileTest\\bb\\184991.jpg");

    }

}

class Copy
{
    String pathF;
    String pathS;

    public Copy(String pathF, String pathS) throws IOException {
        this.pathF = pathF;
        this.pathS = pathS;
         fF=new File(pathF);
        fS=new File(pathS);

        copy();
    }

    File fF;
    File fS;

    void copy()throws IOException {
        FileInputStream is=new FileInputStream(fF);
        FileOutputStream os=new FileOutputStream(fS);
        byte[] flush=new byte[1024];
        int len=-1;
        while((len=is.read(flush))!=-1)
        {
            os.write(flush,0,len);
        }
        os.close();
        is.close();

    }
}
