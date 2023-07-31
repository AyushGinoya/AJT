/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lemdafunction;

/**
 *
 * @author ginoya
 * 
 */

interface A{
    void show();
}

interface B{
    void show2(int i,int j);
}


//class Demo implements A {
//    @Override
//    public void show(){
//        System.out.println("Show called");
//    }
//}

public class LemdaDemo {
    
    public static void main(String[] arg){
        
        //------------------------FunctionalInterface----------------------------------------//
        //A boj = new A();  not possible
        
        //2 way possible
        
        //1.create onother class and implement interface then create obj of class
        
//        A obj = new Demo();
//        obj.show();

        // 2. create Anonymous Class
        
//        A obj = new A()
//        {
//            public void show()
//            {
//                System.out.println("Show called");
//            }
//        };
//        
//        obj.show();
        
        //FunctionalProgramming
        
        A obj = () -> System.out.println("Hey bro");
        obj.show();
        
        B ob = (i,j) ->{
            int c = i+j;
            System.out.println(c);
        };
        
        ob.show2(4, 5);
    }
}
