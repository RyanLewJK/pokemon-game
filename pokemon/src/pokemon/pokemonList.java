
package pokemon;


import java.util.*;
import javax.swing.*;
public class pokemonList {
  public String pokemon[] = {"Charmander","Squirtle","Bulbasaur","Diglet","Magikarp","Zubat","Pidgey",
        "Diglet","Magikarp","JigglyPuff","Pidgey","Diglet","Magikarp","Zubat","Pidgey","Diglet","Magikarp","Zubat","Pidgey",
        "Diglet","JigglyPuff","Zubat","Pidgey","Psyduck","Squirtle","Bulbasaur", "Eevee", "Caterpie", "Rattata", "weedle",
  "Caterpie", "Rattata", "Psyduck", "Caterpie", "Rattata", "weedle", "Dragonite", "Snorlax", "Gengar", "Snorlax", "Charmander", "Gengar",};
   public static ArrayList<String> pokeDex = new ArrayList<>();
  
    
    public void caughtPokemon(int x){
        pokeDex.add(pokemon[x]);      
    }
    public void showPokeDex(String x){  
        JOptionPane.showMessageDialog(null,x + "'s" + " POKEDEX" + "\n" +pokeDex);
    }
    
    
    
    public void pokemonMessage(int x){
        JOptionPane.showMessageDialog(null,"Pokemon found: "+ pokemon[x]);}
    
    public void removePokemon(){
        if(pokeDex.size() == 0){
            JOptionPane.showMessageDialog(null, "you currently have no Pokemon");
        }
        else{
        String[] pokeDexCopy = pokeDex.toArray(new String[0]); 
    String removal = (String)JOptionPane.showInputDialog(null, "remove a pokemon", "removal",  
            3, null,
            pokeDexCopy, pokeDexCopy[0]);
    int removalInt = pokeDex.indexOf(removal);
    if (removalInt >= 0){
    pokeDex.remove(removal);}
        else{ }
}
    }   

    public void mewtwoCaught(){
        String mew2 = "MEWTWO";
    pokeDex.add(mew2);
    }
    
}