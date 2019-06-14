package Java.month6.day14;

import java.io.*;

public class FileLengthTest {
    public static void main(String[] args) {
       // File cc=new File("D:\\j\\java_month6");
        Count cc=new Count("D:\\j\\java_month6\\day13");
        System.out.println(cc.getLength());

    }

}

class Count
{
   long length;
    String path;
    File str;

    public Count(String path) {
        this.path = path;
        this.str = new File(path);
        length=0;
        Length(str);
    }

    public  long getLength() {
        return length;
    }

    void Length(File file)
    {
        if(file.isDirectory())
        {
            String[] fileName=file.list();
            for(String tempN:fileName)
            {
                Length(new File(file,tempN));
            }
        }
        else
        {
            length+=file.length();
        }
    }
}