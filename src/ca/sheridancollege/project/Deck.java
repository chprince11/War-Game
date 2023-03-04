/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */


public class Deck 
{
    private ArrayList<Card> cards;
    
    public Deck() 
    {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        cards = new ArrayList<>();

        for (String suit : suits) 
        {
            for (int rank = 2; rank <= 14; rank++) 
            {
                cards.add(new Card(rank, suit));
            }
        }
        Collections.shuffle(cards);
    }
    
    public Card draw() 
    {
        return cards.remove(0);
    }
    
    public int size() 
    {
        return cards.size();
    }

}


