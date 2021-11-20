package com.company;

import com.company.deckOfCards.Card;
import com.company.game.Game;
import com.company.game.Player;

import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Game game = new Game();
        game.gameSetUp();
        System.out.println(game);

        /**
         * Todo: Separate the game logic into functions
         * Write logic for when all players stick
         * Debug and handle exception
         */

        while (game.getSession()) {
            int numberOfPlayers = game.getPlayers().size();
            if (numberOfPlayers == 1) {
                Long playerId = game.getPlayers().get(0).getId();
                Vector<Card> hand = game.getPlayers().get(0).getHand();

                System.out.println("Player " +  playerId + " with hand: " + hand + " is the winner!!!");
                game.endGame();
                return;
            }

            for (Player player: game.getPlayers()) {
                System.out.println(player);
                int valueOfHand = player.getValueOfHand();

                if (valueOfHand < 17) {
                    System.out.println("Hand less than 17!");
                    game.hit(player);
                    System.out.println("Automatic hit! " + player);
                    System.out.println("Players hand is now: " + player.getValueOfHand() + "\n");

//                    if (valueOfHand > 21 ) {
//                        System.out.println("Player " + player.getId() + " Bust!" );
//                        game.getPlayers().remove(player);
//                        System.out.println("Player " + player.getId() + " has been eliminated... Better Luck next time! \n");
//                        System.out.println("Remaining Jackpot Players: " + game);
//                    }

                }
                else if (valueOfHand >= 17 && valueOfHand < 21){
                    System.out.println("Player " + player.getId() + " Hit/Stick? ");
                    String reply = input.nextLine();
                    game.moreCards(player, reply.toLowerCase());

                    if (valueOfHand > 21 ) {
                        System.out.println("Player " + player.getId() + " Bust!" );
                        game.getPlayers().remove(player);
                        System.out.println("Player " + player.getId() + " has been eliminated... Better Luck next time! \n");
                        System.out.println("Remaining Jackpot Players: " + game);
                    }

                }
                else if (valueOfHand == 21) {
                    System.out.println("Player " + player.getId() + " Jackpot!!! \n");
                    game.endGame();
                    return;
                }
                else {
                    System.out.println("Player " + player.getId() + " Bust!" );
                    game.getPlayers().remove(player);
                    System.out.println("Player " + player.getId() + " has been eliminated... Better Luck next time! \n");
                    System.out.println("Remaining Jackpot Players: " + game + "\n");
                }
            }
        }
    }
}
