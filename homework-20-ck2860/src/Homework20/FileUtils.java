package Homework20;

import java.io.*;

public class FileUtils {
    /**
     * this method would copy the info from the source file to the destination file.
     * File is used to create a file and fileInputStream/fileOutputStream are used to read and write bytes
     * if something wrong occurs, IOExecption would be be thrown
     * @param source
     * @param destination
     */
    public static void copyFile(String source, String destination) throws Exception {
        try {
            File copyfile = new File(source);
            File destfile = new File(destination);
            FileInputStream fileInputStream = new FileInputStream(copyfile);
            FileOutputStream fileOutputStream = new FileOutputStream(destfile);
            byte[] buffer = new byte[(int)copyfile.length()];
            int wholeByte = fileInputStream.read(buffer, 0, buffer.length);
//            if(wholeByte == -1){
//                System.out.println("no byte");
//            }
            fileOutputStream.write(buffer, 0, buffer.length);
            fileInputStream.close();
            fileOutputStream.flush();
            fileOutputStream.close();

        }catch (IOException e){
            System.out.println(e);
        }
    }

    /**
     * The clear directory is used to delete all of the files in the directory.
     * if its not successfully deleted then the IOException is thrown.
     * @param name
     * @throws IOException
     */

    public static void clearDirectory(String name) throws IOException{
        File myDirectory = new File(name);
        for(File file : myDirectory.listFiles()){
            boolean successful = file.delete();
            if(!successful){
                throw new IOException();
            }
        }
    }


//    public static void main(String[] args) throws Exception {
//        copyFile("delete_me.txt","b");
//        clearDirectory("C:\\Users\\Condy\\601Code\\homework-20-ck2860\\output\\delete_me.txt");
//    }

}
