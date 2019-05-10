package pack;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ProduitText implements Ilogger {

    

    @Override
    public void service(String ecrit) {
        // TODO Auto-generated method stub
        File file = new File("C:\\Users\\hp\\eclipse-workspace\\OCR\\src\\ocr\\pack\\testFile1.txt");
        
        //Create the file
        try {
            if (file.createNewFile()){
              System.out.println("File is created!");
            }else{
              System.out.println("File already exists.");
            }
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
         
        //Write Content
        FileWriter writer;
        try {
            writer = new FileWriter(file);  
            writer.write(ecrit);
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
      
    }

}
