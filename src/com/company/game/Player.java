package com.company.game;

import com.company.deckOfCards.Card;

import java.util.Vector;

public class Player {

    private final Long id;
    private final Vector<Card> hand = new Vector<>();
    private int value = 0;

    public Player(Long id) {
        this.id = id;
    }

    /**
     * @return player id
     */
    public Long getId() {
        return id;
    }

    /**
     * adds a new card to the players hand
     * @param card
     */
    public void setHand(Card card) {
        this.hand.add(card);
    }

    /**
     * @return the list of cards in the players hand
     */
    public Vector<Card> getHand() {
        // Todo: write test to verify that the hand returns
        //  is a vector that contains a sequence of cards
        return hand;
    }

    /**
     * Value holds the sum of the value of the players hand
     * @return value
     */
    public int getValueOfHand() {
        // Todo: write test to make sure that the value of the
        //  hand returned is the actual value being expected
        setValue(0);
        for(Card card : hand) value += card.getValue();
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "Player " + id +
                ", {hand=" + hand +
                ", value=" + getValueOfHand() +
                '}';
    }
}
