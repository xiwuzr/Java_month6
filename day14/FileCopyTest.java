package Java.month6.day14;

import java.io.File;

public class FileCopyTest {
    public static void main(String[] args) {
        File f1=new File("D:\\javaFileTest");
        File f2=new File("E:\\a");
        copy(f1,f2);
    }
    static void  copy(File file1,File file2){
        if(file1.isDirectory())
        {
            String temp1=file1.getName();
            file2=new File(file2,temp1);
            file2.mkdir();
            String[] fileName=file1.list();
            for(String temp:fileName){
                File f1=new File(file1,temp);
                copy(f1,file2);
            }
        }
    }
}
class df{
    int fff='k';
}


