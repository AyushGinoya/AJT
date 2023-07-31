/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package setofuniquestudents;

/**
 *
 * @author ginoy
 */
public class Student {
    
    private int sid; 
    private String name;
    
    public Student(int sid, String name)
    {
        this.sid = sid;
        this.name = name;
    }
    
    public int getId(){
        return sid;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean equals(Object ob){
        if(this == ob)
        {
            return true;
        }
        
        if(ob==null || this.getClass()!=ob.getClass()){
            return false;
        }
        
        Student s = (Student) ob;
        
        return (sid == s.sid);
    }
    
    public int hashCode(){
        return this.sid;
        //return Objects.hsa(sid)
    }
    
}
