package ar.com.ada.online.second.harrypottergametest;

import java.util.Objects;
import java.util.Set;

public class Wizard extends Character{
    protected Wand wand;


    public Wizard() {
        super();
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    //Se implementan metodos de la clase
    @Override
    public void attack() {

    }

    @Override
    public void heal() {

    }

    @Override
    public void recovery() {

    }

    @Override
    public void receiveAttack() {

    }

    @Override
    public void isAlive() {

    }

    @Override
    public void addSpell() {

    }

    @Override
    public void characterStatus() {

    }

    @Override
    public void setSpells(Set<Spell> spells) {

    }

    //hashCode equals and toString

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Wizard that = (Wizard) obj;
        return super.equals(obj) && wand.equals(that.wand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public String toString() {
        return String.format(
                "Wizard{ name= %s, location= $s, life= %d, magicEnergy= %d, spells= %d, wand= %s}",
                name,
                location,
                life,
                magicEnergy,
                spells,
                wand
        );
    }
}
