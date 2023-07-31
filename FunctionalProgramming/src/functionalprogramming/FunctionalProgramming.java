/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package functionalprogramming;

/**
 *
 * @author ginoya
 */

interface calculate 
{
    double calcu(double a,double b,char c);
}

public class FunctionalProgramming{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        calculate c = (i,j,k) -> {
            if(k=='+'){
                return i+j;
            } else if(k=='-'){
                return i-j;
            } else if(k=='/'){
                return i/j;
            } else if(k=='*'){
                return i*j;
            }
            return 0;
        };
        double result = c.calcu(5, 2, '+');
        System.out.println(result);
    }
}
