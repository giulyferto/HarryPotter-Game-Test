package ar.com.ada.online.second.harrypottergametest;

import java.util.Objects;
import java.util.Set;

public abstract class Character {
    protected String name;
    protected char location;
    protected Integer life = 100;
    protected Integer magicEnergy = 100;
    public String spells; //Tipo lista
    protected Set<Spell> spellSet;
//Constructor vacio

    public Character() {
    }

//getter and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getLocation() {
        return location;
    }

    public void setLocation(char location) {
        this.location = location;
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public Integer getMagicEnergy() {
        return magicEnergy;
    }

    public void setMagicEnergy(Integer magicEnergy) {
        this.magicEnergy = magicEnergy;
    }

    public Set<Spell> getSpellSet() {
        return spellSet;
    }

    public void setSpellSet(Set<Spell> spellSet) {
        this.spellSet = spellSet;
    }


    public Integer healYourself(Integer recovery) {
        setLife(life += recovery);
        if (life >100){
            life = 100;
        }
        return life; //No se si retorna o no
    }

    public void recoverYourself(Integer magicPower) {
       magicEnergy -= magicPower;
    }

    public void receiveAttack(Integer damage, Integer magicPower, char position) {
        if (position == location) {
            life -= damage;
            if (life < 0) {
                System.out.println("Tu oponente te ha dado y ha acabado con tu vida");
            } else {
                System.out.println("Tu oponente te ha dado! Tu nivel de vida ahora es de " + life);
            }
        } else {
            System.out.println("Tu oponente ha disparado un hechizo pero no te ha alcanzado!!");
        }
    }

    public Boolean isAlive() {
        return this.life > 0;
    }


    public boolean isDarkOrFree() {
        int counter = 0;
        for (Spell spell : spellSet) {
            if (spell instanceof AttackSpell) {
                counter++;
            }
        }
        return counter > 3;
    }

    public abstract void setSpells(Set<Spell> spells);

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Character that = (Character) obj;
        return location == that.location &&
                name.equals(that.name) &&
                life.equals(that.life) &&
                magicEnergy.equals(that.magicEnergy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, life, magicEnergy);
    }

    @Override
    public String toString() {
        return String.format(
                "Character{ name= %s, location= $c, life= %d, magicEnergy= %d, spells = %s}",
                name,
                location,
                life,
                magicEnergy,
                spells
        );

    }

}