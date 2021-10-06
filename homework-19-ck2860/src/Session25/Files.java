package Session25;

import java.io.File;

public class Files {

    public static void create ( String filename){
        File file = new File(filename); //create a file
        System.out.println(file.getAbsolutePath());
        if(file.exists() == true){
            System.out.println("success");
//            System.out.println(file.getUsableSpace()); //number of bytes?
            System.out.println("number of bytes: "+file.length()); //number of bytes?
        }else{
            System.out.println("fail");
        }
    }

    public static void main(String[] args) {
//        create("C:\\Users\\Condy\\Downloads\\words_alpha.txt");
        create("words_alpha.txt");

    }
}
