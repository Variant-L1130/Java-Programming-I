/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author atharvshukla
 */
public class Whistle {
    private String sound;
    
    public Whistle(String whistleSound){
        this.sound = whistleSound;
        
    }
    public void sound(){
       
        System.out.println(this.sound);
        
        
                
    }
    public static void main(String[] args){
        Whistle a = new Whistle("kvaak");
        Whistle b = new Whistle("Peef");
        
        a.sound();
        b.sound();
        a.sound();
    }
}
