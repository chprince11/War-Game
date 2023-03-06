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


