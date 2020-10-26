package ar.com.ada.online.second.harrypottergametest;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Player playerOne = new Player();
        Player playerTwo = new Player();

        System.out.println("\nTurno del jugador uno: ");
        playerOne.chooseCharacter(keyboard);
        playerOne.addSpells(keyboard);

        System.out.println("\n Turno del jugador dos: ");
        playerTwo.chooseCharacter(keyboard);
        playerTwo.addSpells(keyboard);


    }
}
