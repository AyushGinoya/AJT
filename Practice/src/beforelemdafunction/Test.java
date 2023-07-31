/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beforelemdafunction;

/**
 *
 * @author ginoya
 */

public class Test {
   public static void main(String[] args){
       WorkerInterfaceUser wku = new WorkerInterfaceUser();
       
       wku.execute(new WorkerInterface(){
           @Override
           public void doSomething() {
               System.out.println("I am doing something");
           }
       });
   }
   
}
