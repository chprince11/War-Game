package ca.sheridancollege.project;

import java.util.ArrayList;

public class Game 
{
    /**
     * @param args
     */
    public static void main(String[] args)
    {
         Player player1 = new Player("Balkaran");
         Player player2 = new Player("Brar");

         ArrayList<Card> pot = new ArrayList<>();
         Deck deck = new Deck();

         while (deck.size() > 0) 
         {
            player1.addCard(deck.draw());
            player2.addCard(deck.draw());
        }
        while (player1.getHandSize() > 0 && player2.getHandSize() > 0 && player1.getHandSize() < 52 && player2.getHandSize() < 52) 
        {
            Card card1 = player1.playCard();
            Card card2 = player2.playCard();
            pot.add(card1);
            pot.add(card2);

            System.out.println(player1.getName() + " plays " + card1);
            System.out.println(player2.getName() + " plays " + card2);

            if (card1.getRank() > card2.getRank()) 
            {
                System.out.println(player1.getName() + " wins the pot!");
                player1.addCard(pot);
            } 
            else if (card2.getRank() > card1.getRank()) 
            {
                System.out.println(player2.getName() + " wins the pot!");
                player2.addCard(pot);
            } 
            else 
            {
                System.out.println("It's a tie!");

                if (player1.getHandSize() > 0 && player2.getHandSize() > 0) 
                {
                    pot.add(player1.playCard());
                    pot.add(player2.playCard());
                }
            }
            
            System.out.println(player1.getName() + " has " + player1.getHandSize() + " cards left.");
            System.out.println(player2.getName() + " has " + player2.getHandSize()+ " cards left.");


        }
   
    }

}