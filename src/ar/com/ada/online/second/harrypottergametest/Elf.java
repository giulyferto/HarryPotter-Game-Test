package ar.com.ada.online.second.harrypottergametest;

import java.util.Objects;

public class Elf extends Character {
    public Elf() {
        super();
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
    public void darkOrFree() {

    }
    //hashCode equals and toString
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Elf that = (Elf) obj;
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public String toString() {
        return String.format(
                "Elf { name= %s, location= $s, life= %d, magicEnergy= %d, spells= %d}",
                name,
                location,
                life,
                magicEnergy,
                spells
        );
    }
}
