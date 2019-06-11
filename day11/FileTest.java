package Java.month6.day11;


    import java.io.*;

    public class FileTest {
        public static void main(String[] args) throws IOException {
            //要复制的文件对象
            File file = new File("D:" + File.separator + "javaFileTest");
           // System.out.println("D:" + File.separator + "javaFileTest");
            //复制的位置
            File file1 = new File("E:" + File.separator + "a");

            copyFile(file, file1);

        }

        /**
         * 复制文件
         * @param file1 复制的文件
         * @param file2 复制的位置
         * @throws IOException
         */
        private static void copyFile(File file1, File file2) throws IOException {
            if (!file1.isDirectory()) {
                FileWriter fileWriter = new FileWriter(file2.getParent() + File.separator + file2.getName());
                //System.out.println(file2.getParent() + File.separator + file2.getName()+"");
                //创建一个读的缓冲区
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file1.getAbsoluteFile()),"GBK"));
                //创建一个写入的缓冲区
                BufferedWriter bw = new BufferedWriter(fileWriter);
                int ch = 0;
                while(true){
                    ch = br.read();
                    if(-1 == ch){
                        break;
                    }
                    bw.write(ch);
                }
                br.close();
                bw.close();

            } else {
                file2.mkdir();
                String[] str = file1.list();

               // System.out.println(str);
                for (int i = 0; i < str.length; i++) {
                    File isFile = new File(file1.getAbsolutePath() + File.separator + str[i]);
                    System.out.println(file1.getAbsolutePath());
                    File copyFile = new File(file2.getAbsolutePath() + File.separator + str[i]);
                    System.out.println(file2.getAbsolutePath());
                    System.out.println(" ");
                    copyFile(isFile, copyFile);
                }
            }

        }
    }

