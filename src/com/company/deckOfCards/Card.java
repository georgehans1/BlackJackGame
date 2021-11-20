package com.company.deckOfCards;

public class Card {
    private final String name;
    private final int value;
    private final String suiteName;
    private final String symbol;

    @Override
    public String toString() {
        return name + symbol;
    }

    public Card(String name, int value, String suiteName, String symbol) {
        this.name = name;
        this.value = value;
        this.suiteName = suiteName;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String getSuiteName() {
        return suiteName;
    }
}
