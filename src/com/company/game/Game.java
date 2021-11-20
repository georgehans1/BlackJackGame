package com.company.game;

import com.company.deckOfCards.Deck;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Game {

    private Boolean session = false;
    private final ArrayList<Player> players = new ArrayList<>();
    Deck deck = new Deck();

    public boolean getSession() {
        return session;
    }

    public void setSession(Boolean session) {
        this.session = session;
    }

    /**
     * @return the list of players currently playing
     */
    public List<Player> getPlayers() {
        return players;
    }


    /**
     * Initial game setups
     */
    public void gameSetUp(){
        deck.completeDeck();
        deck.shuffleDeck();
        players.addAll(List.of(
                new Player(1L),
                new Player(2L),
                new Player(3L)
        ));
        setSession(true);
        dealCard();
    }

    /**
     * Loops through the list of players and set their hand with two cards to begin the game
     */
    public void dealCard() {
        players.forEach(p -> {
            p.setHand(deck.getNextCard());
            p.setHand(deck.getNextCard());
        });
    }

    /**
     * Takes a player and adds a card to the hand of the player
     */
    public void hit(Player player) {
        player.setHand(deck.getNextCard());
    }

    /**
     * More card should return true if the player wants a hit
     * @return boolean
     */
    public void moreCards(Player player, String input) {
        if (Objects.equals(input, "hit")) {
            player.setHand(deck.getNextCard());
            System.out.println(player + "\n");
        }
    }

    public void endGame() {
        setSession(false);
        System.out.println("Game Over!");
    }

    @Override
    public String toString() {
        return "Jackpot players: " + players + "\n";
    }
}
