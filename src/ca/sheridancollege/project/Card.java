/**
 * SYST 17796 War Game project base code.
 * 
 * @author chprince11 (Prince Chauhan) 06 Feb 2023
 * @author LazyPencils (Yihang Lin) 06 Feb 2023
 * @author balkaran10 (Balkaran Singh) 06 Feb 2023
 * @author Haimanyu (Haimanyu Haimanyu) 06 Feb 2023
 */

package ca.sheridancollege.project;

public class Card 
{

    private int rank;
    private String suit;

    public Card(int rank, String suit) 
    {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() 
    {
        return rank;
    }

    public String getSuit() 
    {
        return suit;
    }

    @Override
    public String toString() 
    {
        return rank + " of " + suit;
    }
}
