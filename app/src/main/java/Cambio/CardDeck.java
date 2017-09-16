package Cambio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by windows on 12/09/2017.
 */

//TODO: testing all methods.
public class CardDeck {

    HashSet<Card> _allCards = new HashSet<>();
    HashSet<Card> _cardInGame = new HashSet<>() ; //contain all the cards witch already in play(on table) and not in the deck

    public CardDeck(){

        //put all cards in set
        for(Card.Card_Rank rank : Card.Card_Rank.values())
            for(Card.Card_Shape shape : Card.Card_Shape.values())
                _allCards.add(new Card(shape,rank));
    }

    //TODO: Check if converting and shuffle works.
    private void shuffle(){
        ArrayList<Card> deckAsList = new ArrayList<Card>(_allCards);
        Collections.shuffle(deckAsList);
        _allCards = new HashSet<>(deckAsList);

    }

    //this function return 4 cards. when game start for each player we call to this function
    public Card[] get4CardForPlayer(){
        Card[] cards = new Card[4];
        Iterator<Card> it = _allCards.iterator();
        for(int i = 0 ; i<4 ; i++){
            cards[i]=it.next();
            _cardInGame.add(cards[i]);  //add to "inGame" set of cards
            it.remove();
        }
        return cards;

    }

    //function to draw new card.
    public Card getCard(){
        Iterator<Card> it = _allCards.iterator();
        Card card = it.next();
        _cardInGame.add(card);
        it.remove();

        return card;
    }




}
