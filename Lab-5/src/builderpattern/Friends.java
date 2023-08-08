/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderpattern;

/**
 *
 * @author ginoy
 */
public class Friends {
    private String trederyo;
    private String hackeryo;
    private String flutteryo;
    private int id;
    
    public String toString(){
        return "trederyo  : " + trederyo +"\nflutteryo : "+flutteryo +"\nhackeryo  : "+hackeryo;
    }

    public String getTrederyo() {
        return trederyo;
    }

    public String getHackeryo() {
        return hackeryo;
    }

    public String getFlutteryo() {
        return flutteryo;
    }

    public int getId() {
        return id;
    }

    public void setTrederyo(String trederyo) {
        this.trederyo = trederyo;
    }

    public void setHackeryo(String hackeryo) {
        this.hackeryo = hackeryo;
    }

    public void setFlutteryo(String flutteryo) {
        this.flutteryo = flutteryo;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
