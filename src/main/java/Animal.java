/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Animal {
    private String speciesName;

    public Animal(String name) {
        this.speciesName = name;
    }
  
    public final String getName() {
        return speciesName;
    }

    public final void setName(String name) {        
        this.speciesName = name;
    }
    
    public void makeSound() {
        System.out.println("The animal made a sound");
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + speciesName + '}';
    }
}
