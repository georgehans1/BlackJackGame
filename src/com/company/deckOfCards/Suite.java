package com.company.deckOfCards;

import java.util.List;
import java.util.Vector;

public abstract class Suite {
    final private Vector<Card> suite;

    public Suite(String suiteName, String symbol) {
         suite = new Vector<Card>(List.of(
                new Card("2", 2, suiteName, symbol),
                new Card("3", 3, suiteName, symbol),
                new Card("4", 4, suiteName, symbol),
                new Card("5", 5, suiteName, symbol),
                new Card("6", 6, suiteName, symbol),
                new Card("7", 7, suiteName, symbol),
                new Card("8", 8, suiteName, symbol),
                new Card("9", 9, suiteName, symbol),
                new Card("10", 10, suiteName, symbol),
                new Card("Jack", 10, suiteName, symbol),
                new Card("Queen", 10, suiteName, symbol),
                new Card("King", 10, suiteName, symbol),
                new Card("Ace", 11, suiteName, symbol)
        ));
    }

    public Vector<Card> getSuite() {
        return suite;
    }
}

class HeartsSuite extends Suite {
    public HeartsSuite(String suite, String symbol) {
        super(suite, symbol);
    }
}

class DiamondsSuite extends Suite {
    public DiamondsSuite(String suite, String symbol) {
        super(suite, symbol);
    }
}

class ClubsSuite extends Suite {
    public ClubsSuite(String suiteName, String symbol) {
        super(suiteName, symbol);
    }
}

class SpadesSuite extends Suite {
    public SpadesSuite(String suiteName, String symbol) {
        super(suiteName, symbol);
    }
}