package deck;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */
public class Card {
    
        private final Face face;// face of card("Ace", "Deuce",...)
        private final Suit suit;// suit of card ("hearts", "diamonds",...)
        
        //two-argument constructor initializes card's face and suit
        public Card(Face cardFace, Suit cardSuit){
            this.face = cardFace;//initializes face of card
            this.suit = cardSuit;// initializes suit of card
        }
        
        //return String representation of card
        public String toString(){
            return face + "of" + suit;
        }
        
    
//end of class Card
    
}
