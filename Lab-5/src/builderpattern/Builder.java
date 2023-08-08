/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderpattern;

/**
 *
 * @author ginoy
 */
public class Builder {
    Friends f = new Friends();
    
    void setTraderyo1(String s){
        f.setTrederyo(s);
    }
    
    void setHackeryo(String s){
        f.setHackeryo(s);
    }
    
    void setFlutteryo(String s){
        f.setFlutteryo(s);
    }
    
    Friends create(){
        return f;
    }
}
