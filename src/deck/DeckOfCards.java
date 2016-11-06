/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deck;


import java.security.SecureRandom;

/**
 *
 * @author Jason
 */
public class DeckOfCards {
    
    private Card[] deck; //array of Card objects
        private int currentCard; //index of next Card to be deald (0-51)
        private static final int NUMBER_OF_CARDS = 52; // constant # of Cards
        //random number generator
        private static final SecureRandom randomNumbers = new SecureRandom();
    
    public DeckOfCards() {
       
            
        deck = new Card[NUMBER_OF_CARDS];//create array of card objects
        currentCard = 0;//first card dealt be deck[0]
            
       //populate deck with Card objects
        for (int count = 0; count < deck.length; count++){
            deck[count] = 
                 new Card(Face.values()[count % 13], Suit.values()[count/13]);
                 
                
        }
    }  
    
        //shuffle deck of cards with one-pass algorithm
        public void shuffle(){
            //next call to method dealCard should start at deck[0} again
            currentCard = 0;
            
            //This is a Fisher Yates shuffle because for each card, pick another random Card (0-index) and swap them with the current card.
            for (int first = deck.length - 1; first > 0; first--){
                //select a random number between 0 and index first.
                int second = randomNumbers.nextInt(first);
                
                //swap current Card with randomly selected Card
                Card temp = deck[first];
                deck[first] = deck[second];
                deck[second] = temp;
            }
        }
                
        //deal one card
        public Card dealCard(){
            
            //determine whether Cards remain to be dealt
            if (currentCard < deck.length)
                return deck[currentCard++]; //return current card in array
            else
                return null;//return null to indicate taht all cards were dealt
        }
    
//end of class DeckOfCards
    
}
