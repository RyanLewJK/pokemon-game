
package pokemon;
import java.util.*;
import javax.swing.*;
public class name {
    public String name;
    
    public void startingMessage(){
        JOptionPane.showMessageDialog(null, "welcome to the pokemon game");
        name = (String)JOptionPane.showInputDialog("Enter your trainer name");
        if (!name.equalsIgnoreCase("")){
        
        }
        else{
            String name1 = "Zoe"; String name2 = "John"; String name3 = "Damian"; String name4 = "Nicholas";
            String name5 = "Darren"; String name6 = "Ray"; String name7 = "Amy"; String name8 = "Jane";
            String name9 = "Tara"; String name10 = "Elaine";
            Random rand = new Random();
            int names = rand.nextInt(10);
            switch(names){
                case 0: name = name1; break;
                case 1: name = name2; break;
                case 2: name = name3; break;
                case 3: name = name4; break;
                case 4: name = name5; break;
                case 5: name = name6; break;
                case 6: name = name7; break;
                case 7: name = name8; break;
                case 8: name = name9; break;
                case 9: name = name10; break;
            }
            
        }
        JOptionPane.showMessageDialog(null, "welcome " + name);
    }
}
