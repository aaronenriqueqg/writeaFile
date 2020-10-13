/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writeafile;

import java.io.FileWriter;

/**
 *
 * @author aaron
 */
public class WriteAFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            FileWriter writer = new FileWriter("Foo.txt");
            
            writer.write("Hello world!");
            writer.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("hello");
    }
    
}
