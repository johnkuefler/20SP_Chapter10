/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Pairott extends Animal {
    
    private int wingspanLength;

    public Pairott(int wingspanLength, String name) {
        super(name);
        this.wingspanLength = wingspanLength;
    }
    
    public int getWingspanLength() {
        return wingspanLength;
    }

    public void setWingspanLength(int wingspanLength) {
        this.wingspanLength = wingspanLength;
    }
    
    @Override
    public void makeSound() {
       System.out.print("The pairot squawked");
    }
}
