/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package functionalprogrammingusinglemdasingpattern;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author ginoy
 */
public class LambdaInStrategy {
    
    public static int totalNumbers(List<Integer> numbers, Predicate <Integer> select)
    {
        int result=0;
        for(int n : numbers)
        {
            if(select.test(n))
            {
                result += n;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("all numbers");
        System.out.println(totalNumbers(list, no->true));
        
        System.out.println("Odd numbers");
        System.out.println(totalNumbers(list, no -> no%2!=0));
        
        System.out.println("Even numbers");
        System.out.println(totalNumbers(list, no -> no%2==0));
    }
}
