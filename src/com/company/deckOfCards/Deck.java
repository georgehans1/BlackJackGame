package com.company.deckOfCards;

import java.util.*;

public class Deck {

    private final Vector<Card> cardDeck = new Vector<>();
    private final Vector<Card> shuffledDeck = new Vector<>();

    /**
     * @return the unshuffled card deck
     */
    public Vector<Card> getOriginalDeck() {
        return cardDeck;
    }

    /**
     * shuffles the cardDeck and stores the sequence in a new deck called the shuffledDeck
     */
    public void shuffleDeck() {
        shuffledDeck.addAll(cardDeck);
        Collections.shuffle(shuffledDeck);
    }

    /**
     * @return a shuffled deck of cards
     */
    public Vector<Card> getShuffledDeck() {
        return shuffledDeck;
    }

    /**
     * @return the next card at the top of the array
     */
    public Card getNextCard() {
        Card nextCard = shuffledDeck.get(0);
        shuffledDeck.remove(0);
        return nextCard;
    }

    /**
     * Deck should decrease in size after a card is dealt
     * @return the size of the shuffled deck
     */
    public int getDeckSize() {
        // Todo: Write test to make sure that deck size
        //  reduces after cards are dealt from it
        return shuffledDeck.size();
    }

    /**
     * Creates a heart suite
     */
    public void createHearts() {
            Suite hearts = new HeartsSuite("Hearts", "♥");
            cardDeck.addAll(hearts.getSuite());
        }

    /**
     * Creates a Diamond suite
     */
    public void createDiamonds() {
            Suite diamonds = new DiamondsSuite("Diamonds", "♦");
            cardDeck.addAll(diamonds.getSuite());
        }

    /**
     * Creates a club suite
     */
    public void createClubs() {
            Suite clubs = new ClubsSuite("Clubs", "♣");
            cardDeck.addAll(clubs.getSuite());

        }

    /**
     * Create a spade suite
     */
    public void createSpades() {
            Suite spades = new SpadesSuite("Spades", "♠");
            cardDeck.addAll(spades.getSuite());

        }

    /**
     * Add all the suites together to create a deck of cards
     */
    public void completeDeck() {
            createHearts();
            createSpades();
            createClubs();
            createDiamonds();
        }
}
