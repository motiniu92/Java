/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMultithreading.Synchronization;

/**
 *
 * @author shshe
 */
//Main method
public class TestSynchronization1 {
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
  
}

//No Synchronized method and using the method
class Table{
void printTable(int n){ //method not sychronized
for (int i = 1; i <=5; i++) {
        System.out.println(n*i);
        try {
        Thread.sleep(500);
    } catch (Exception e) { e.printStackTrace();
    }
    }
}
}

//Thread class1
class MyThread1 extends Thread{
Table t;

    public MyThread1(Table t) {
        this.t = t;
    }
@Override
public void run(){
t.printTable(5);
}
}

//Thread class2
class MyThread2 extends Thread{
Table t;
public MyThread2(Table t){
this.t = t;
}
@Override
public void run(){
t.printTable(100);
}
}
