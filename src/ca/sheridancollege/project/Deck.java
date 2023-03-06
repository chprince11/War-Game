/**
 * SYST 17796 War Game project base code.
 * 
 * @author chprince11 (Prince Chauhan) 06 Feb 2023
 * @author LazyPencils (Yihang Lin) 06 Feb 2023
 * @author balkaran10 (Balkaran Singh) 06 Feb 2023
 * @author Haimanyu (Haimanyu Haimanyu) 06 Feb 2023
 */

package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

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


