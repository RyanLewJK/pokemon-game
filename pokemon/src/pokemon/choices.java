
package pokemon;
import java.util.*;
import javax.swing.*;
public class choices {
    
    
    public void choice (String x){
         String options[] = {"walk", "check pokedex","remove pokemon", "info","exit game"};
         while(true){
    int pChoices = JOptionPane.showOptionDialog(null, 
            "what would you like to do","", JOptionPane.DEFAULT_OPTION, 3, null
    , options, options[0]);
    
        Random rand = new Random();
        int x1 = rand.nextInt(201)-100;
        int y1 = rand.nextInt(201)-100;
        int x2 = rand.nextInt(201)-100;
        int y2 = rand.nextInt(201)-100;
        walk walk1 = new walk();
       if (pChoices == 0){
            
           walk1.pokemonFound(x1, y1, x2, y2);
           }
           
       else if (pChoices == 1){pokemonList pokemon = new pokemonList();
           pokemon.showPokeDex(x);
           }
       else if (pChoices == 2){
           pokemonList pokemon = new pokemonList();
           pokemon.removePokemon();
       }
       
       else if (pChoices == 3){
           JOptionPane.showMessageDialog(null, "Hi there " + x + 
                   ", you seem to be a bit confused about the game." + "\nThis game is pretty simple, just walk until you find some "
                           + "pokemon to catch!");
       }
               
       else {int finalChoice = JOptionPane.showConfirmDialog(null, "are you really sure you want to leave?",
               "", JOptionPane.YES_NO_OPTION, 3, null);
       if (finalChoice == 0){
           JOptionPane.showMessageDialog(null, "Have a nice day " + x);
           break;      }
       else{
           
       }
       }
       
    }
}
}