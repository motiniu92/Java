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
public class TestMultiNaming1 extends Thread{
    @Override
    public void run(){
        System.out.println("running....");
    }
    public static void main(String[] args) {
        TestMultiNaming1 t1 = new TestMultiNaming1();
        TestMultiNaming1 t2 = new TestMultiNaming1();
        System.out.println("Name of t1: "+ t1.getName());
        System.out.println("Name of t2: "+ t2.getName());
        t1.start();
        t2.start();
        
        t1.setName("Sonoo Jaiswal");
        System.out.println("After chaning name of t1: "+ t1.getName());
    }
}
