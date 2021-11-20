package com.company.test;

import com.company.deckOfCards.Deck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackJackTesting {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void assertThatCompleteDeckContains52Cards() {
        Deck deck = new Deck();
        deck.completeDeck();
        int expected = 52;
        int actual = deck.getOriginalDeck().size();

        assertEquals(expected, actual);
    }

    @Test
    void assertThatShuffledDeckIsNotEmpty() {
        Deck deck = new Deck();
        deck.completeDeck();
        deck.shuffleDeck();
        int expected = 52;
        int actual = deck.getShuffledDeck().size();

        assertEquals(expected, actual);
    }

    @Test
    void assertThatDeckIsShuffled() {
        Deck deck = new Deck();
        deck.completeDeck();
        deck.shuffleDeck();
        boolean actual = !(deck.getShuffledDeck().equals(deck.getOriginalDeck()));

        assertTrue(actual);
    }

    @Test
    void assertThatGetNextCardReturnsNextCardOnTheDeck() {
        Deck deck = new Deck();
        deck.completeDeck();
        deck.shuffleDeck();
        int expected = deck.getShuffledDeck().get(0).getValue();
        deck.getNextCard();
        int actual = deck.getShuffledDeck().get(0).getValue();
        assertNotEquals(expected, actual);
    }
}