
package pokemon;
import javax.swing.*;
import java.util.*;
public class fight {
    
    Random rand = new Random();
   
    int playerHealth = 350;
    int turn;
    
    public void pokemonFight(int x){
        
     int originalHealth = rand.nextInt(350)+201;
     int pokemonHealth = originalHealth;
     turn = rand.nextInt(2);
     String line = "|";  
     
     pokemonList pokemons = new pokemonList();
     
     while(pokemonHealth > 0 || playerHealth > 0){
         double health0 = (double)playerHealth/350*50;
         double health1 = (double)pokemonHealth/originalHealth*50;
         int intHealth0 = (int)Math.round(health0);
         int intHealth1 = (int)Math.round(health1);
         String healthGraphic0 = line.repeat(intHealth0);
     String healthGraphic1 = line.repeat(intHealth1);
         int attack = rand.nextInt(201);
     int pokemonAttack = rand.nextInt(101);
         JOptionPane.showMessageDialog(null, "Your Health: " + playerHealth + "HP" + "\n" + healthGraphic0 +"\n"
         + "VS" +"\n" + pokemons.pokemon[x]+ " Health: " + pokemonHealth +"\n" + healthGraphic1,"Battle starting",1);
         
         if (turn == 0){
             turn++;
             JOptionPane.showMessageDialog(null, "starting your turn");
             JOptionPane.showMessageDialog(null, "You did " + attack +"DMG", "Damage Dealt", 1);
             pokemonHealth = pokemonHealth - attack;
             if(pokemonHealth < 0){
                 JOptionPane.showMessageDialog(null, "You won!\nNow capturing pokemon");
                 pokemonList pokemon = new pokemonList();
                 pokemon.caughtPokemon(x);
                 break;
             }
         }
         else{
             turn--;
             JOptionPane.showMessageDialog(null, "starting opponent's turn");
             JOptionPane.showMessageDialog(null, "They did " + pokemonAttack +"DMG", "Damage Dealt", 1);
             playerHealth = playerHealth - pokemonAttack;
             if(playerHealth < 0) {
                 JOptionPane.showMessageDialog(null, "You lost and pokemon escaped");
                 break;
             }
         }
     }
    }
     
}