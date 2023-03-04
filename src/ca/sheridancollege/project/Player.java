/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
import java.util.ArrayList;

public class Player 
{
    private String name;
    private ArrayList<Card> hand;
    
    public Player(String name) 
    {
        this.name = name;
        hand = new ArrayList<>();
    }
    
    public String getName() 
    {
        return name;
    }
    
    public void addCard(Card card) 
    {
        hand.add(card);
    }

    public void addCard(ArrayList<Card> pot) 
    {
        hand.addAll(pot);
    }

    public Card playCard() 
    {
        return hand.remove(0);
    }
    
    public int getHandSize() 
    {
        return hand.size();
    }

}


