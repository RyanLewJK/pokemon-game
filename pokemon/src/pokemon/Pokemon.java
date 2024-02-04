
package pokemon;

public class Pokemon {


    public static void main(String[] args) {
        name playerName = new name();
        choices game = new choices();
        playerName.startingMessage();
        game.choice(playerName.name);
    }
    
}
