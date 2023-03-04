/**
 * SYST 17796 Project Base code.
 * @author LazyPencils (Yihang Lin)
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves
 * as a modifier.
 *
 * @author dancye
 */
public class Card 
{
    // default modifier for child classes

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular
     *         playing card etc.
     */

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
