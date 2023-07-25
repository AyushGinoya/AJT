/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package functionalprogramming;

/**
 *
 * @author ginoy
 */


interface Calculator {

    public double calculate(double x,double y,char opt);
}
public class FunctionalProgramming{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Calculator cal =(x,y,opt)->{
               if(opt=='+'){
                   return x+y;
               }else if(opt=='-'){
                   return x-y;
               } else if(opt=='*'){
                   return x*y;
               } else if(opt=='/'){
                   return x/y;
               }else
                return 0;
            };  
            
            double ans1 = cal.calculate(1,10,'+');
            System.out.println(ans1);   
    }
}
