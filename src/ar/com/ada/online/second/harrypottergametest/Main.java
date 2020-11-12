package ar.com.ada.online.second.harrypottergametest;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        GamePlay player = new GamePlay();
        //Se ejecuta el metodo una vez
        player.ChoosePlayer();
        player.loadSpellCharacters();


    }
}
