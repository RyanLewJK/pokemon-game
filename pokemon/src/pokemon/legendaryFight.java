
package pokemon;

import javax.swing.*;
import java.util.*;
public class legendaryFight {

    int turn; int confusion;
    public void fight(){
        Random rand = new Random();
        pokemonList pokemon = new pokemonList();
        int mewtwoHealth = 550;
        int playerHealth = 350;
        String line = "|";
     String[] legendaryOptions = {"fight", "run away"};
        JOptionPane.showMessageDialog(null, "a strong entity is approaching","?", 2);
     int choice = JOptionPane.showOptionDialog(null, "fight it?","", 
             JOptionPane.DEFAULT_OPTION, 2, null, legendaryOptions, legendaryOptions[0]);
     JOptionPane.showMessageDialog(null, "YOU HAVE ENTERED INTO A BATTLE WITH MEWTWO, GOOD LUCK","",0);
     if (choice == 0){
        while(mewtwoHealth > 0 || playerHealth > 0){
            
            double health0 = (double)playerHealth/350*50;
         double health1 = (double)mewtwoHealth/550*50;
         int intHealth0 = (int)Math.round(health0);
         int intHealth1 = (int)Math.round(health1);
          String healthGraphic0 = line.repeat(intHealth0);
     String healthGraphic1 = line.repeat(intHealth1);
     
            int attack = rand.nextInt(101)+100;
            
            int defendChance = rand.nextInt(3);
            int block = rand.nextInt(attack);
            
            JOptionPane.showMessageDialog(null, "Your Health: " + playerHealth + "HP" + "\n" + healthGraphic0 +"\n"
         + "VS" +"\n" + "Mewtwo"+ " Health: " + mewtwoHealth +"\n" + healthGraphic1,"Battle starting",1);
            if (turn == 0){
                turn++;
                JOptionPane.showMessageDialog(null, "starting your turn");
                if(confusion == 0){
             JOptionPane.showMessageDialog(null, "You did " + attack +"DMG", "Damage Dealt", 1);
             if(defendChance == 0 || defendChance == 1){
                 JOptionPane.showMessageDialog(null, "Mewtwo Blocked Your Attack!"
                         + "\nReduced Damage: " + (attack - block) + "DMG");
                 mewtwoHealth = mewtwoHealth - (attack - block);
                 if(mewtwoHealth < 0){
                    JOptionPane.showMessageDialog(null, "YOU BEAT MEWTWO, A LEGENDARY POKEMON!"
                            + " NOW CAPTURING MEWTWO");
                    pokemon.mewtwoCaught();
                    break;
                 }
             }
             else{
                mewtwoHealth = mewtwoHealth - attack;
             if(mewtwoHealth<0){
                JOptionPane.showMessageDialog(null, "YOU BEAT MEWTWO, A LEGENDARY POKEMON!"
                            + " NOW CAPTURING MEWTWO");
                    pokemon.mewtwoCaught(); break;
             }}
             
            }
                else{
                    JOptionPane.showMessageDialog(null, "You are confused and you hit yourself!"
                            + "\nDealt: " + attack); confusion--;
                    playerHealth = playerHealth - attack;
                    if (playerHealth < 0){
                 JOptionPane.showMessageDialog(null, "You Lost"); break;
             }
                }
            }
            else{
                turn--;
                JOptionPane.showMessageDialog(null,"starting opponent's turn");
                int moves = rand.nextInt(3);
                switch (moves){
                    case 0: JOptionPane.showMessageDialog(null, "Mewtwo used confusion!"
                            + "\nskipping your next turn"
                            + "\nDealt: 35DMG"); playerHealth = playerHealth - 35;
                            turn++;
                    break;
                    
                    case 1: 
                    if(rand.nextInt(2) == 1){
                        JOptionPane.showMessageDialog(null, "Mewtwo used PsyStrike!"
                                + "\nIt was a Critical Hit!"
                                + "\nDamage Dealt: " + 160 +"DMG"); playerHealth = playerHealth - 160;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Mewtwo used PsyStrike!"
                                + "\nIt was not a Critical Hit!" + "\nDamage Dealt: " + 80 + "DMG");
                        playerHealth = playerHealth - 80;
                    }
                    break;
                    
                    case 2: JOptionPane.showMessageDialog(null, "Mewtwo used super confusion!");
                    confusion = confusion + rand.nextInt(2); break;
                }
                if(playerHealth < 0){
                    JOptionPane.showMessageDialog(null, "You lost");
                    break;
                }
            }
        }
        
    }
     else{
         JOptionPane.showMessageDialog(null, "you live for another day");
     }
}
}