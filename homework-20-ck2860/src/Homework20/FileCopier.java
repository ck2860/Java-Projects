package Homework20;

import java.io.File;

public class FileCopier {
    /**
     * @param args the name for directoryInput and directoryOutput (the directoryInput should be input\\ and the directoryOutput should be output\\)
     * clearDirectory is called to clear the output directory before copying the files from the directoryInput to directoryOutput.
     * if the file is a directory it would be skipped.
     * Every time the file is copied, it counts the files.
     * @throws Exception if there is no files to clear and read, etc..
     */
    public static void main(String[] args) throws Exception {
        try{
            if(args.length == 2){
                long start = System.currentTimeMillis();
                String directoryInput = args[0];
                String directoryOutput = args[1];
                FileUtils.clearDirectory(directoryOutput);
                File myInputDirectory = new File(directoryInput);
                int counter =0;
                long space = 0;
                for(File file : myInputDirectory.listFiles()){
                    if(!file.isDirectory()) {
                        String fileInput = directoryInput + file.getName();
                        String fileOutput = directoryOutput + file.getName();
                        FileUtils.copyFile(fileInput, fileOutput);
                        System.out.println("Copying file '" + file.getName() + "' ...g");
                        counter++;
                        space = space + file.getTotalSpace();
                    }else{
                        System.out.println("Skipping directory '" + file.getName()+"'...");
                    }
                }
                long end = System.currentTimeMillis();
                System.out.println("Copied " + counter + " files (" + (space) + " bytes) in " + (end-start) + "  milliseconds");
            }else{
                System.out.println("Usage: java homework20.FileCopier <input dir> <output dir>");
                System.exit(1);
            }
        }catch(Exception e){
            System.out.println(e);
            System.exit(1);
        }
    }
}
