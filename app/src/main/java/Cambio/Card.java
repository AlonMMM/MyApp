package Cambio;

/**
 * Created by windows on 12/09/2017.
 */

public class Card {
//card shapes
    public enum Card_Shape{
        SPADE, CLUB, DIAMOND, HEART
    }

    public enum Card_Rank{
        ACE, TWO, THREE, FOUR, FIVE, SIX , SEVEN , EIGHT, NINE, TEN , JACK, QUEEN, KING
    }

    Card_Shape _cardShape;
    Card_Rank _cardValue;

    public Card(Card_Shape shape,Card_Rank value){
        _cardShape = shape;
        _cardValue = value;
    }

    public Card_Shape getCardShape(){
        return _cardShape;
    }

    public Card_Rank getCardValue(){
        return _cardValue;
    }
}
