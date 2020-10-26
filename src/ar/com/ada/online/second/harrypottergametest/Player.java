package ar.com.ada.online.second.harrypottergametest;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    Character wizard = new Wizard();

    Character elf = new Elf();

    Spells spells = new Spells();

    private ArrayList<Spells> spell;

    public void chooseCharacter(Scanner keyboard) {
        System.out.println("Seleccione 1 si quiere jugar como un MAGO");
        System.out.println("Seleccione 2 si quiere jugar como un ELFO");
        int answer = keyboard.nextInt();
        if (answer == 1) {
            System.out.println("Seleccione un mago de la lista: ");
            System.out.println("\t1) Harry Potter");
            System.out.println("\t2) Draco Malfoy");
            System.out.println("\t3) Hermione Granger");
            System.out.println("\t4) Albus Dumbledore");
            System.out.println("\t5) Severus Snape");

            int option = keyboard.nextInt();
            switch (option) {
                case 1:
                    wizard.setName("Harry Potter");
                    break;
                case 2:
                    wizard.setName("Draco Malfoy");
                    break;
                case 3:
                    wizard.setName("Hermione Granger");
                    break;
                case 4:
                    wizard.setName("Albus Dumbledore");
                    break;
                case 5:
                    wizard.setName("Severus Snape");
                    break;
                default:
                    System.out.println("Debe elegir una opcion valida");
                    wizard = null;
            }
        } else if (answer == 2) {
            System.out.println("Seleccione un Elfo de la lista: ");
            System.out.println("\t1) Dobby");
            System.out.println("\t2) Kreacher");
            System.out.println("\t3) Hokey");
            System.out.println("\t4) Winky");

            int option = keyboard.nextInt();

            switch (option) {
                case 1:
                    elf.setName("Dobby");
                    break;
                case 2:
                    elf.setName("Kreacher");
                    break;
                case 3:
                    elf.setName("Hokey");
                    break;
                case 4:
                    elf.setName("Winky");
                    break;
                default:
                    System.out.println("Debe elegir una opcion valida");
                    elf = null;
            }
        } else {
            System.out.println("Opcion no valida");
            System.exit(0);
        }
    }

    public void addSpells(Scanner keyboard) {
        int continueMenu;
        do {
            System.out.println("Por favor ingrese una categoria de hechizos: \n");
            System.out.println("\t1)Hechizos de Ataque\n");
            System.out.println("\t2)Hechizos de Sanacion\n");
            System.out.println("\t3)Hechizos de Recuperacion\n");
            int option = keyboard.nextInt();

            switch (option) {
                case 1:
                    getAttackSpells(keyboard);
                    if (spells != null)
                        spells.addAttackSpell();
                    break;
                case 2:
                    getHealingSpells(keyboard);
                    break;
                case 3:
                    getRecoverySpells(keyboard);
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }
            System.out.println("Desea agregar otro Hechizo?: \n\t1) Si\n\t2)No");
            continueMenu = keyboard.nextInt();
        }  while (continueMenu == 1);
    }

    public void getAttackSpells(Scanner keyboard) {
        System.out.println("\nHechizos de ataque:");
        System.out.println("\t1) Avada Kedravra: \n 100pts de daño, 90pts energia magica requerida.");
        System.out.println("\t2) Imperius: \n 90pts de daño, 80pts de energia magica requerida.");
        System.out.println("\t3) Cruciatus: \n 90pts de daño, 80pts de energia magica requerida.");
        System.out.println("\t4) Expulso: \n 25pts de daño, 15pts de energia magica requerida.");
        System.out.println("\t5) Expelliarmus: \n 20pts de daño, 10pts de energia magica requerida.");
        System.out.println("\t6) Sectum: \n 15pts de daño, 8pts de energia magica requerida.");
        System.out.println("\t7) Desmaius: \n 15pts de daño, 10pts de energia magica requerida.");
        System.out.println("\t8) Petrificus totalus: \n 10 pts de daño, 5pts de energia magica requerida.");

        int option = keyboard.nextInt();
        switch (option) {
            case 1:
                spells.setName("Avada Kedravra");
                spells.setDamage(100);
                spells.setMagicPower(90);
                break;
            case 2:
                spells.setName("Imperius");
                spells.setDamage(90);
                spells.setMagicPower(80);
                break;
            case 3:
                spells.setName("Cruciatus");
                spells.setDamage(90);
                spells.setMagicPower(80);
                break;
            case 4:
                spells.setName("Expulso");
                spells.setDamage(25);
                spells.setMagicPower(15);
                break;
            case 5:
                spells.setName("Expelliarmus");
                spells.setDamage(20);
                spells.setMagicPower(10);
                break;
            case 6:
                spells.setName("Sectum");
                spells.setDamage(15);
                spells.setMagicPower(8);
                break;
            case 7:
                spells.setName("Desmaius");
                spells.setDamage(15);
                spells.setMagicPower(10);
                break;
            case 8:
                spells.setName("Petrificus totalus");
                spells.setDamage(10);
                spells.setMagicPower(5);
                break;
            default:
                System.out.println("Opcion incorrecta.");
        }
    }

    public void getHealingSpells(Scanner keyboard) {
        System.out.println("\nHechizos de Sanacion: ");
        System.out.println("\t1) Anapneo: \n 20pts de sanacion, 15pts energia magica requerida.");
        System.out.println("\t2) Tergeo: \n 20pts de sanacion, 15pts de energia magica requerida.");
        System.out.println("\t3) Ferula: \n 15pts de sanacion, 10pts de energia magica requerida.");
        System.out.println("\t4) Reparifors: \n 10pts de sanacion, 5pts de energia magica requerida.");
        System.out.println("\t5) Episkey: \n 5pts de sanacion, 3pts de energia magica requerida.");
        System.out.println("\t6) Vulnera Sanentur: \n 5pts de sanacion, 3pts de energia magica requerida.");
        int option = keyboard.nextInt();
        switch (option) {
            case 1:
                spells.setName("Anapneo");
                spells.setRecovery(20);
                spells.setMagicPower(15);
                break;
            case 2:
                spells.setName("Tergeo");
                spells.setRecovery(20);
                spells.setMagicPower(15);
                break;
            case 3:
                spells.setName("Ferula");
                spells.setRecovery(15);
                spells.setMagicPower(10);
                break;
            case 4:
                spells.setName("Reparifors");
                spells.setRecovery(10);
                spells.setMagicPower(5);
                break;
            case 5:
                spells.setName("Episkey");
                spells.setRecovery(5);
                spells.setMagicPower(3);
                break;
            case 6:
                spells.setName("Vulnera Sanentur");
                spells.setRecovery(5);
                spells.setMagicPower(3);
                break;
            default:
                System.out.println("Opcion incorrecta.");
        }
    }
    public void getRecoverySpells (Scanner keyboard) {
        System.out.println("\nHechizos de Recuperacion: ");
        System.out.println("\t1) Contorsione: \n 15pts de sanacion, 8pts energia magica requerida.");
        System.out.println("\t2) Taenia: \n 15pts de sanacion, 8pts de energia magica requerida.");
        System.out.println("\t3) Ventriculum: \n 15pts de sanacion, 8pts de energia magica requerida.");
        System.out.println("\t4) Cortisem detraho: \n 15pts de sanacion, 8pts de energia magica requerida.");
        System.out.println("\t5) Enervate: \n 15pts de sanacion, 8pts de energia magica requerida.");
        System.out.println("\t6) Reparifors: \n 15pts de sanacion, 8pts de energia magica requerida.");
        int option = keyboard.nextInt();

        switch (option) {
            case 1:
                spells.setName("Contorsione");
                spells.setMagicPower(15);
                spells.setMagicPower(8);
                break;
            case 2:
                spells.setName("Taenia");
                spells.setMagicPower(15);
                spells.setMagicPower(8);
                break;
            case 3:
                spells.setName("Ventriculum");
                spells.setMagicPower(15);
                spells.setMagicPower(8);
                break;
            case 4:
                spells.setName("Cortisem detraho");
                spells.setMagicPower(15);
                spells.setMagicPower(8);
                break;
            case 5:
                spells.setName("Enervate");
                spells.setMagicPower(15);
                spells.setMagicPower(8);
                break;
            case 6:
                spells.setName("Reparifors");
                spells.setMagicPower(15);
                spells.setMagicPower(8);
                break;
            default:
                System.out.println("Opcion incorrecta.");
        }
    }








}


