package card_deck;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {

    private ArrayList<Integer> deck = new ArrayList();

    /**
     * 
     */
    public CardDeck() {
        //-----Clubs-----
        deck.add(Cards.CLUB_ACE);
        deck.add(Cards.CLUB_2);
        deck.add(Cards.CLUB_3);
        deck.add(Cards.CLUB_4);
        deck.add(Cards.CLUB_5);
        deck.add(Cards.CLUB_6);
        deck.add(Cards.CLUB_7);
        deck.add(Cards.CLUB_8);
        deck.add(Cards.CLUB_9);
        deck.add(Cards.CLUB_10);
        deck.add(Cards.CLUB_JACK);
        deck.add(Cards.CLUB_QUEEN);
        deck.add(Cards.CLUB_KING);

        //-----Diamonds-----
        deck.add(Cards.DIAMOND_ACE);
        deck.add(Cards.DIAMOND_2);
        deck.add(Cards.DIAMOND_3);
        deck.add(Cards.DIAMOND_4);
        deck.add(Cards.DIAMOND_5);
        deck.add(Cards.DIAMOND_6);
        deck.add(Cards.DIAMOND_7);
        deck.add(Cards.DIAMOND_8);
        deck.add(Cards.DIAMOND_9);
        deck.add(Cards.DIAMOND_10);
        deck.add(Cards.DIAMOND_JACK);
        deck.add(Cards.DIAMOND_QUEEN);
        deck.add(Cards.DIAMOND_KING);

        //-----Hearts-----
        deck.add(Cards.HEART_ACE);
        deck.add(Cards.HEART_2);
        deck.add(Cards.HEART_3);
        deck.add(Cards.HEART_4);
        deck.add(Cards.HEART_5);
        deck.add(Cards.HEART_6);
        deck.add(Cards.HEART_7);
        deck.add(Cards.HEART_8);
        deck.add(Cards.HEART_9);
        deck.add(Cards.HEART_10);
        deck.add(Cards.HEART_JACK);
        deck.add(Cards.HEART_QUEEN);
        deck.add(Cards.HEART_KING);

        deck.add(Cards.SPADE_ACE);
        deck.add(Cards.SPADE_2);
        deck.add(Cards.SPADE_3);
        deck.add(Cards.SPADE_4);
        deck.add(Cards.SPADE_5);
        deck.add(Cards.SPADE_6);
        deck.add(Cards.SPADE_7);
        deck.add(Cards.SPADE_8);
        deck.add(Cards.SPADE_9);
        deck.add(Cards.SPADE_10);
        deck.add(Cards.SPADE_JACK);
        deck.add(Cards.SPADE_QUEEN);
        deck.add(Cards.SPADE_KING);
    }

    public int drawCard() {
        int cardVal = deck.get(0);
        deck.remove(0);
        return cardVal;

    }

    public void shuffle() {
        Collections.shuffle(deck);
    }
    
    public void resetDeck() {
        //-----Clubs-----
        deck.add(Cards.CLUB_ACE);
        deck.add(Cards.CLUB_2);
        deck.add(Cards.CLUB_3);
        deck.add(Cards.CLUB_4);
        deck.add(Cards.CLUB_5);
        deck.add(Cards.CLUB_6);
        deck.add(Cards.CLUB_7);
        deck.add(Cards.CLUB_8);
        deck.add(Cards.CLUB_9);
        deck.add(Cards.CLUB_10);
        deck.add(Cards.CLUB_JACK);
        deck.add(Cards.CLUB_QUEEN);
        deck.add(Cards.CLUB_KING);

        //-----Diamonds-----
        deck.add(Cards.DIAMOND_ACE);
        deck.add(Cards.DIAMOND_2);
        deck.add(Cards.DIAMOND_3);
        deck.add(Cards.DIAMOND_4);
        deck.add(Cards.DIAMOND_5);
        deck.add(Cards.DIAMOND_6);
        deck.add(Cards.DIAMOND_7);
        deck.add(Cards.DIAMOND_8);
        deck.add(Cards.DIAMOND_9);
        deck.add(Cards.DIAMOND_10);
        deck.add(Cards.DIAMOND_JACK);
        deck.add(Cards.DIAMOND_QUEEN);
        deck.add(Cards.DIAMOND_KING);

        //-----Hearts-----
        deck.add(Cards.HEART_ACE);
        deck.add(Cards.HEART_2);
        deck.add(Cards.HEART_3);
        deck.add(Cards.HEART_4);
        deck.add(Cards.HEART_5);
        deck.add(Cards.HEART_6);
        deck.add(Cards.HEART_7);
        deck.add(Cards.HEART_8);
        deck.add(Cards.HEART_9);
        deck.add(Cards.HEART_10);
        deck.add(Cards.HEART_JACK);
        deck.add(Cards.HEART_QUEEN);
        deck.add(Cards.HEART_KING);

        deck.add(Cards.SPADE_ACE);
        deck.add(Cards.SPADE_2);
        deck.add(Cards.SPADE_3);
        deck.add(Cards.SPADE_4);
        deck.add(Cards.SPADE_5);
        deck.add(Cards.SPADE_6);
        deck.add(Cards.SPADE_7);
        deck.add(Cards.SPADE_8);
        deck.add(Cards.SPADE_9);
        deck.add(Cards.SPADE_10);
        deck.add(Cards.SPADE_JACK);
        deck.add(Cards.SPADE_QUEEN);
        deck.add(Cards.SPADE_KING);
    }

}
