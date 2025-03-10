package com.csc;
import java.io.FileOutputStream;

public class CheeseWriter {
    private String fileName;

    public CheeseWriter(String output_filename){
        fileName = output_filename;
    }
    public void write_data(String string){
        try{
            FileOutputStream outputStream = new FileOutputStream(fileName);
            byte[] strToBytes = string.getBytes();
            outputStream.write(strToBytes);
            outputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
