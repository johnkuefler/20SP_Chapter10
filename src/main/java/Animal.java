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
  
    public String getName() {
        return speciesName;
    }

    public void setName(String name) {
        this.speciesName = name;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + speciesName + '}';
    }
}
