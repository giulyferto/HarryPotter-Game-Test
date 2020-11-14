package ar.com.ada.online.second.harrypottergametest;

import java.util.Objects;

public class AttackSpell extends Spell {
    public static Integer counter = 0;
    //public static int addAttackSpell;


    public AttackSpell() {
        super();
    }
    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    //Metodo para contar el tipo de hechizos de ataque
    public void addAttackSpell(Spell spell) {
        if (spell instanceof AttackSpell) {
            counter++;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AttackSpell that = (AttackSpell) obj;
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return String.format(
                "AttackSpells { name= %s, recovery= $d, life= %d, magicPower== %d }",
                name,
                recovery,
                magicPower
        );
    }
}
