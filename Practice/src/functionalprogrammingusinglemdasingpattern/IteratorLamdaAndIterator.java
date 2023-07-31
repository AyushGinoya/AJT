/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package functionalprogrammingusinglemdasingpattern;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author ginoy
 */
public class IteratorLamdaAndIterator {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,56,87,9,2999);
        
        System.out.println("Numbers are : ");
        
        
        //external Iterator
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i) + "    ");
        }
            System.out.println();
        for(int n : list)
        {
            System.out.print( n+ "    ");
        }
            System.out.println();
            
        // Internal Iterator
        
        list.forEach(n->System.out.print( n+ "    "));
        
        System.out.println();
        //How it is work internally ?
        
//         Consumer<Integer> cons = new Consumer(){
//            @Override
//            public void accept(Object t) {
//                System.out.print(t + "      ");
//            }
//             
//         };
//         
//         list.forEach(cons);
//         
//         System.out.println();
    }    
}
