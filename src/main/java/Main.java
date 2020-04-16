
import Chapter10.Logging.ConsoleLogger;
import Chapter10.Logging.FileLogger;
import Chapter10.Logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Main {
    public static void main(String[] args) {
        
        Logger myLogger = new ConsoleLogger();
        
        myLogger.logInfo("Creating tiger");
        Tiger myTiger = new Tiger(5, "African Tiger");
        
        myLogger.logInfo("Creating pairot");
        Pairott myPairot = new Pairott(20, "Tropical Pairot");
        
        myLogger.logInfo("Playing sounds");
        animalSoundPlayer(myTiger, myLogger);
        animalSoundPlayer(myPairot,myLogger);
    }
    
    
    public static void animalSoundPlayer(Animal someAnimal, Logger logger) {
        logger.logInfo("About to make sound for " + someAnimal.toString());
        someAnimal.makeSound();
    }
}
