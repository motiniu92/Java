/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_IO.JavaWriter;

import java.io.FileWriter;
import java.io.Writer;

/**
 *
 * @author User
 */
public class JavaWriterExample1 {
    public static void main(String[] args) throws Exception{
        Writer w = new FileWriter("output.txt");
    }
}