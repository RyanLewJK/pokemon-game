
package pokemon;
import javax.swing.*;
import java.util.*;
public class walk {
  
    int x;
    int y;
    
    
    Random rand1 = new Random();
    Random rand2 = new Random();
    Random rand3 = new Random();
    int xIncrease = rand1.nextInt(201) -100;
    int yIncrease = rand2.nextInt(201) -100;
    
    
    public int[] walkLocation(){
        x += xIncrease;
        y += yIncrease;
        
        int[] location = {x,y};
        System.out.println(location[0] +  "," + location[1]);
        return location;
        
    }
    
    public void pokemonFound(int a, int b, int c, int d){
         
        int xBound1 = x + 50;
        int xBound2 = x - 50;
        int yBound1 = x + 50;
        int yBound2 = x - 50;
        String pokemonOptions[] = {"catch", "ignore"};
        if(((a <=xBound1 && a >=xBound2) && (b <=yBound1 && b >=yBound2)) || ((c <=xBound1 && c >=xBound2)) && ((d <=yBound1 && d >=yBound2))){
            int pFound = JOptionPane.showOptionDialog(null, "pokemon found",
                   "",JOptionPane.DEFAULT_OPTION, 1, null, pokemonOptions, pokemonOptions[0]);
            switch(pFound){
                case 0: Random rand = new Random();
               int pArrayIndex = rand.nextInt(43);
               pokemonList pokemon = new pokemonList();
               int fightDecision = rand.nextInt(5);
               if(pArrayIndex == 42){
                   try{Thread.sleep(3000);
                   legendaryFight mewtwoFight = new legendaryFight();
                   mewtwoFight.fight();}
                   catch(Exception e){}
               }
               else{
                    pokemon.pokemonMessage(pArrayIndex);
               if (fightDecision == 0){
                   try{
                       Thread.sleep(1500);
                       String fightOptions[]={"Fight", "Leave"};
                       int fight = JOptionPane.showOptionDialog(null, "pokemon found wants to fight!",
                   "",JOptionPane.DEFAULT_OPTION, 2, null, fightOptions, fightOptions[0]);
                       if (fight == 0){
                          fight pFight = new fight();
                          pFight.pokemonFight(pArrayIndex);
                       }
                       else{
                           JOptionPane.showMessageDialog(null,"you left it");
                       }
                   }
                   catch(Exception e){
                       
                   }
               }
               else if (fightDecision == 1){
                   String pokemonRun[]={"run after it", "leave it"};
                   int pRun = JOptionPane.showOptionDialog(null, "its trying to run away!",
                   "",JOptionPane.DEFAULT_OPTION, 2, null, pokemonRun, pokemonRun[0]);
                   try{
                       Thread.sleep(1500);
                   if (pRun == 0){
                       Random Rand = new Random();
                      int chaseOutcome = rand.nextInt(2);
                       if (chaseOutcome == 0){
                           JOptionPane.showMessageDialog(null, "you couldn't chase after it");
                           
                       }
                       else{
                           JOptionPane.showMessageDialog(null, "caught up to it, succesfully captured");
                           
                           pokemon.caughtPokemon(pArrayIndex);
                       }
                   }
                   else{
                       JOptionPane.showMessageDialog(null, "you let it get away");
                   }
               }
                   catch(Exception e){
                       
                   }
               }
               else{
                   try{
                       Thread.sleep(1500);
                       JOptionPane.showMessageDialog(null, "Succesfully caught pokemon");
                       
                           pokemon.caughtPokemon(pArrayIndex);
                   }
                   catch(Exception e){
                       
                   }
               }
            }
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"found nothing");
        }
    }
    
}
