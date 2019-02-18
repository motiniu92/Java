/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_IO.JavaSequenceInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

/**
 *
 * @author shshe
 */
public class Input1 {
    public static void main(String[] args) throws Exception{
        FileInputStream fin1 = new FileInputStream("D:\\test.txt");
        FileInputStream fin2 = new FileInputStream("D:\\test1.txt");
        FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
        SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
        int i;
        while((i=sis.read())!= -1){
        fout.write(i);
        }
        sis.close();
        fout.close();
        fin1.close();
        fin2.close();
        System.out.println("Success..");
    }
    
}
