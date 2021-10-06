package Homework20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopierThread extends Thread {
    /**
     * extending the thread class for this class.
     * private fields for source and destination.
     */
    private String source;
    private String destination;

    /**
     * constructor for the copierThread Source file and Destination file would be the parameters.
     * @param source file
     * @param destination file
     */

    public CopierThread(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }

    /**
     * the run method would run when the start method is called.
     * This is where the threads would read the files and write the files as well.
     * if something occurs the IOException would be thrown.
     */
    @Override
    public void run() {
        try {
            File copyfile = new File(source);
            File destfile = new File(destination);
            FileInputStream fileInputStream = new FileInputStream(copyfile);
            FileOutputStream fileOutputStream = new FileOutputStream(destfile);
            byte[] buffer = new byte[(int)copyfile.length()];
            fileInputStream.read(buffer, 0, buffer.length);
            fileOutputStream.write(buffer, 0, buffer.length);
            fileInputStream.close();
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    /**
     * @param args the name for directoryInput and directoryOutput (the directoryInput should be input\\ and the directoryOutput should be output\\)
     * clearDirectory is called to clear the output directory before copying the files from the directoryInput to directoryOutput.
     * if the file is a directory it would be skipped.
     * Every time the file is copied, it counts the files.
     * @throws Exception if there is no files to clear and read, etc..
     */
    public static void main(String[] args) throws Exception {
        try{
            if (args.length == 2) {
                long start = System.currentTimeMillis();
                String directoryInput = args[0];
                String directoryOutput = args[1];
                FileUtils.clearDirectory(directoryOutput);
                File myInputDirectory = new File(directoryInput);
                int counter = 0;
                long space = 0;
                for (File file : myInputDirectory.listFiles()) {
                    if (!file.isDirectory()) {
                        String fileInput = directoryInput + file.getName();
                        String fileOutput = directoryOutput + file.getName();
                        System.out.println("Copying file '" + file.getName() + "' ...");
                        CopierThread copierThread = new CopierThread(fileInput, fileOutput);
                        copierThread.start();
                        counter ++;
                        space = space + file.getTotalSpace();
                    } else {
                        System.out.println("Skipping directory '" + file.getName()+"'...");
                    }
                }
                long end = System.currentTimeMillis();
                System.out.println("Copied " + counter + " files (" + space + " bytes) in " + (end-start) + "  milliseconds");
        } else {
            System.out.println("Usage: java homework20.CopierThread <input dir> <output dir>");
            System.exit(1);
            }
        }catch(Exception e){
            System.out.println(e);
            System.exit(1);
        }
    }
}

