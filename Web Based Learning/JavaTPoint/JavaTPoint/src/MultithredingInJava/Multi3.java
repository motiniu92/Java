/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultithredingInJava;

/**
 *
 * @author User
 */
public class Multi3 implements Runnable {
    @Override
    public void run(){
        System.out.println("thread is running.....");
    }
    public static void main(String[] args) {
      Multi3 m1 = new Multi3();
      Thread t1 = new Thread(m1);
      t1.start();
      
    }
}
