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
public class DeckOfCardsTest {

/**
* @param args the command line arguments
*/
        
    //execute the application
    public static void main(String[] args){
        
        SignatureBlock sig = new SignatureBlock();
        System.out.println(sig);
        
        
        DeckOfCards myDeckOfCards = new DeckOfCards();
        
        System.out.println("\nBefore Shuffle\n");
        for (int i=1; i <= 52; i++){
            System.out.printf("%-19s", myDeckOfCards.dealCard());
            
            if (i % 4 ==0){ //output a newline after every fourth card
                System.out.println();
            }
        }    
        myDeckOfCards.shuffle();//place cards in random order using Fisher-yates shuffle
          
        System.out.println("\nAfter Shuffle\n");
        //print all 52 cards in the order in which they are dealt
        for (int a=1; a <= 52; a++){
            
            //deal and display a Card
            System.out.printf("%-19s", myDeckOfCards.dealCard());
                
            if (a % 4 ==0){ //output a newline after every fourth card
                System.out.println();
            }
        }
    }
}//end class DeckOfCardsTest
    

