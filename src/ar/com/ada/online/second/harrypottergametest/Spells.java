package ar.com.ada.online.second.harrypottergametest;

import java.util.ArrayList;

public class Spells {
    private String name;
    private Integer damage;
    private Integer recovery;
    private Integer magicPower;
    private Integer counter = 0;


    public Spells() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getRecovery() {
        return recovery;
    }

    public void setRecovery(Integer recovery) {
        this.recovery = recovery;
    }

    public Integer getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(Integer magicPower) {
        this.magicPower = magicPower;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }
//Metodo para contar el tipo de hechizos de ataque
    public Integer addAttackSpell() {
        counter++;
        return counter;
    }
}
